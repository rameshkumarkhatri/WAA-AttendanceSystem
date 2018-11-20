package com.cs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.StudentCourseBlock;
import com.cs.attendance.domain.User;


@Repository
public interface BlockCourseStudentRepository extends JpaRepository<StudentCourseBlock, Long> {

	@Query("SELECT att FROM StudentCourseBlock att WHERE block_id = ?1 AND student_id = ?2") 
	public StudentCourseBlock get(long block_id, long student_id);
	

	@Query("SELECT att FROM StudentCourseBlock att WHERE block_id = ?1 AND course_id = ?2") 
	public List<StudentCourseBlock> getStudentsByBlockIDAndCourseID(long block_id, long student_id);
}
