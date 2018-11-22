package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.adapters.UserAdapater;
import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.domain.User;
import edu.mum.waa.tmattendanceservice.repository.StudentRepository;
import edu.mum.waa.tmattendanceservice.repository.TMAttendanceRepository;
import edu.mum.waa.tmattendanceservice.service.RoleService;
import edu.mum.waa.tmattendanceservice.service.StudentService;
import edu.mum.waa.tmattendanceservice.service.UserService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	@Autowired
	TMAttendanceRepository tmAttendanceRepository;
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;

	@Override
	public Student createStudent(Student student) {
		User user = UserAdapater.getUser(student);
		userService.createUser(user);
		return studentRepository.save(student);
	}

	@Override
	public Student readStudent(String studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student deleteStudent(String studentId) {
		// TODO Auto-generated method stub
		Student student = readStudent(studentId);
		studentRepository.delete(student);
		return student;
	}

	@Override
	public TMAttendance find(String studentId, int date, int month, int year, String shift) {
		Student student = studentRepository.findById(studentId).get();
		return tmAttendanceRepository.findByStudent(student);
	}

}
