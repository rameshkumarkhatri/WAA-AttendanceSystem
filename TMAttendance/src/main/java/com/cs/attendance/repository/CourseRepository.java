package com.cs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Block;
import com.cs.attendance.domain.Course;
import com.cs.attendance.domain.User;


@Repository
public interface CourseRepository extends JpaRepository< Course, Long> {

	@Query(value = "SELECT att FROM Course att WHERE title = ?1")
	public Course findCourseByTitle(String title);

	@Query(value = "SELECT att FROM Course att WHERE course_id = ?1")
	public Course findByCourseCode(String courseName);
	
}
