package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Course;

public interface CourseService {
	Course createCourse(Course course);

	Course readCourse(String courseId);

	Course updateCourse(Course course);

	Course deleteCourse(String courseId);
}
