package com.cs.attendance.service;

import java.util.List;

import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.Course;
import com.cs.attendance.domain.User;

public interface CourseService {
	
	public List<Course> getAll();
	public Course save(Course course);
}
