package com.cs.attendance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.Course;
import com.cs.attendance.domain.User;
import com.cs.attendance.repository.BlockRepository;
import com.cs.attendance.repository.CourseRepository;
import com.cs.attendance.repository.UserRepository;
import com.cs.attendance.service.BlockService;
import com.cs.attendance.service.CourseService;
import com.cs.attendance.service.UserService;

@Service
//@Transactional
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	CourseRepository repo;

	@Override
	public List<Course> getAll() {
		return repo.findAll();
	}

	@Override
	public Course save(Course course) {
		return repo.save(course);
	}
	

}
