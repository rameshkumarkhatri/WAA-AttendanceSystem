package com.cs.attendance.service;

import java.util.List;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.StudentCourseBlock;
import com.cs.attendance.domain.User;

public interface BlockCourseStudentService {
	
	
	public StudentCourseBlock findModelByStdBlockIdUserId(String blockName, long studentID);
	
//	public List<StudentCourseBlock> findModelsByBlockNameAndCourseName(String blockName, String courseName);
	public List<StudentCourseBlock> findModelsByBlockIDAndCourseID(long blockId, long courseID);
	
}
