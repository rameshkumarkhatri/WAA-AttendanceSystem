package com.cs.attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.Course;
import com.cs.attendance.domain.Student;
import com.cs.attendance.domain.StudentCourseBlock;
import com.cs.attendance.domain.User;
import com.cs.attendance.repository.BlockCourseStudentRepository;
import com.cs.attendance.repository.BlockRepository;
import com.cs.attendance.repository.CourseRepository;
import com.cs.attendance.service.AttendanceService;
import com.cs.attendance.service.BlockCourseStudentService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/services")
public class RestController {

	long userID = 2;
	
	@Autowired
	AttendanceService attendaceService;
	

	@Autowired
	BlockCourseStudentService blockCourseStdService;


	@Autowired
	CourseRepository  courseRepository;
	
	/**
	 * This will return the attendance by block id of current loggedin user.
	 * @param blockName
	 * @return
	 */
	@GetMapping("/student/attendance/block/{blockName}")
	public List<Attendance> getAttendanceByBlockNameForCurrentStudent(@PathVariable("blockName") String blockName)
	{
		
		StudentCourseBlock stdCB = blockCourseStdService.findModelByStdBlockIdUserId(blockName, userID);
		if(stdCB == null)
		{
			return null;
		}
		List<Attendance> att = attendaceService.findAllByStdBlockCourseId(stdCB.getId());
		
		for(Attendance a : att) {
			System.out.println(a.getId()+""+a.getLocation()+" "+a.getTime()+" "+a.getStd_block_course_id());
		}
		
		return att;
	}
	
	

	@Autowired
	BlockRepository  blockRepository;

	@GetMapping("/students/attendance/block/{blockName}/course/{courseName}")
	public List<Student> getAttendanceByBlock(@PathVariable("blockName") String blockName, @PathVariable("courseName") String courseName) {
		Block block = blockRepository.findBlockByName(blockName);
		Course course = courseRepository.findByCourseCode(courseName);
		System.out.println(block.getStartDate() +"block "+ course.getTitle());
		return attendaceService.getStudensWithAttendance(block.getId(), course.getId());
		
	}
	
	
	
}
