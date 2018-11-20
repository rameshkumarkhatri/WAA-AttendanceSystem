package com.cs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.User;


@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

	@Query(value = "SELECT att FROM Attendance att WHERE std_block_course_id = ?1")
//	@Query(value = "select NEW com.cs.attendance.domain.Attendance("+
//            "o.id, o.date, o.location o.time, o.std_block_course_id)"+
//	"FROM attendance as o WHERE std_block_course_id = ?1 ") 
	public List<Attendance> findAllByStdBlockCourseId(long stdblockstudentId);
}
