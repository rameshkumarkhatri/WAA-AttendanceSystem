package com.cs.attendance.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.attendance.domain.AttendanceDTO;

@RestController
public class StudentController {

	@RequestMapping("/get/attendance/{id}/{year}/{month}/{date}/{shift}")
	public ResponseEntity<AttendanceDTO> getAttendace(@PathVariable("id") String studentId,
			@PathVariable("date") int date, @PathVariable("month") int month, @PathVariable("year") int year,
			@PathVariable("shift") String shift) {
		return null;
	}

	@RequestMapping("/get/attendance/{bid}/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getBlockAttendance(@PathVariable("sid") String studentId,
			@PathVariable("bid") String blockId) {
		return null;
	}

	@RequestMapping("/get/attendance/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getAllAttendance(@PathVariable("sid") String studentId) {
		return null;
	}
}
