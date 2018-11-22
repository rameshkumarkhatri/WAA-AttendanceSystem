package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.TMAttendance;

public interface TMAttendanceService {
	public TMAttendance createTMAttendance(TMAttendance tmAttendance);

	public TMAttendance getAttendance(String studentId);
}
