package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;

public interface StudentService {
	Student createStudent(Student student);

	Student readStudent(String studentId);

	Student updateStudent(Student student);

	Student deleteStudent(String studentId);

	TMAttendance find(String studentId, int date, int month, int year, String shift);
}
