package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.Course;
import edu.mum.waa.tmattendanceservice.repository.CourseRepository;
import edu.mum.waa.tmattendanceservice.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course readCourse(String courseId) {
		return courseRepository.findById(courseId).get();
	}

	@Override
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course deleteCourse(String courseId) {
		Course course = readCourse(courseId);
		courseRepository.delete(course);
		return course;
	}

}
