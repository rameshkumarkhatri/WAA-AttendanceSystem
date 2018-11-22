package edu.mum.waa.tmattendanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.waa.tmattendanceservice.domain.Course;
import edu.mum.waa.tmattendanceservice.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseService;

	@PostMapping("/create")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return new ResponseEntity<Course>(courseService.createCourse(course), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Course> getCourse(@PathVariable("sid") String courseId) {
		return new ResponseEntity<Course>(courseService.readCourse(courseId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
		return new ResponseEntity<Course>(courseService.updateCourse(course), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Course> deleteCourse(@PathVariable("sid") String courseId) {
		return new ResponseEntity<Course>(courseService.deleteCourse(courseId), HttpStatus.OK);
	}
}
