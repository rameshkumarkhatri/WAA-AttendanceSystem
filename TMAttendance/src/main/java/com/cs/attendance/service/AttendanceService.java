package com.cs.attendance.service;

import java.util.List;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Student;
import com.cs.attendance.domain.User;

public interface AttendanceService {
	
	public List<Attendance> findAllByStdBlockCourseId(long id);
	
	List<Student> getStudensWithAttendance(String blockName, String courseName);
	
	List<Student> getStudensWithAttendance(long blockId, long courseId);

}
