package com.cs.attendance.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.attendance.domain.AttendanceDTO;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

	@RequestMapping("/get/attendance/{fid}")
	public ResponseEntity<List<AttendanceDTO>> getBlockAttendance(@PathVariable("fid") String facultyId) {
		return null;
	}

}
