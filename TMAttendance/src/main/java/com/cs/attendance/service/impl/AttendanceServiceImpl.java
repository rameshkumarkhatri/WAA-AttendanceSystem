package com.cs.attendance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.Course;
import com.cs.attendance.domain.Student;
import com.cs.attendance.domain.StudentCourseBlock;
import com.cs.attendance.domain.User;
import com.cs.attendance.repository.AttendanceRepository;
import com.cs.attendance.repository.BlockRepository;
import com.cs.attendance.repository.CourseRepository;
import com.cs.attendance.repository.UserRepository;
import com.cs.attendance.service.AttendanceService;
import com.cs.attendance.service.BlockCourseStudentService;
import com.cs.attendance.service.UserService;

@Service
//@Transactional
public class AttendanceServiceImpl implements AttendanceService{

	
	@Autowired
	AttendanceRepository repo;
	
	@Autowired
	BlockRepository  blockRepository;
	

	@Autowired
	CourseRepository  courseRepository;


	@Autowired
	UserRepository  userRepository;
	
	
	@Autowired
	BlockCourseStudentService blockCourseStdService;

	@Override
	public List<Attendance> findAllByStdBlockCourseId(long id) {

		return repo.findAllByStdBlockCourseId(id);
	}

	@Override
	public List<Student> getStudensWithAttendance(String blockName, String courseName) {
		System.out.println("REQUEST "+blockName+" "+courseName);
		

		Course course = courseRepository.findCourseByTitle(courseName);
		
		if(course == null) return null;
		System.out.println("COURSE "+course.getCourseID());
		Block block = blockRepository.findBlockByName(blockName);
		if(block == null) return null;
		List<StudentCourseBlock> listSCB = blockCourseStdService.findModelsByBlockIDAndCourseID(block.getId(), course.getId());
		List<Student> list = new ArrayList<>(); 
		for(StudentCourseBlock b : listSCB) {
			User user = userRepository.getOne(b.getStudentID());
			List<Attendance>  attendance = repo.findAllByStdBlockCourseId(b.getId());
			Student student = new Student(user.getFirst_name(), user.getLast_name(), user.getStudent_id(), attendance);
			list.add(student);
		}
		
		return list;
	}

	@Override
	public List<Student> getStudensWithAttendance(long blockId, long courseId) {
		// TODO Auto-generated method stub
		List<StudentCourseBlock> listSCB = blockCourseStdService.findModelsByBlockIDAndCourseID(blockId, courseId);
		List<Student> list = new ArrayList<>(); 
		for(StudentCourseBlock b : listSCB) {
			User user = userRepository.getOne(b.getStudentID());
			List<Attendance>  attendance = repo.findAllByStdBlockCourseId(b.getId());
			Student student = new Student(user.getFirst_name(), user.getLast_name(), user.getStudent_id(), attendance);
			list.add(student);
		}
		
		return list;
	}
	
	

}
