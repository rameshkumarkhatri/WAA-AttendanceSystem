package com.cs.attendance.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.attendance.domain.AttendanceDTO;
import com.cs.attendance.domain.TMAttendance;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/delete/{sid}")
	public ResponseEntity<String> deleteTMAttendance(@PathVariable("sid") String studentId) {

		return new ResponseEntity<String>("TMAttendance for student deleted successfully", HttpStatus.OK);
	}

	@PutMapping("/update/{sid}")
	public ResponseEntity<String> updateTMAttendance(@PathVariable("sid") String studentId,
			@RequestBody TMAttendance tmAttendance) {

		return new ResponseEntity<String>("TMAttendance for student updates successfully", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> createTMAttendance(@RequestBody TMAttendance tmAttendance) {

		return new ResponseEntity<String>(
				"TMAttendance for " + tmAttendance.getStudent().getStudentId() + " registered successfully",
				HttpStatus.OK);
	}

	@RequestMapping("/get/attendance/{id}/{year}/{month}/{date}/{shift}")
	public ResponseEntity<AttendanceDTO> getStudentAttendace(@PathVariable("id") String studentId,
			@PathVariable("date") int date, @PathVariable("month") int month, @PathVariable("year") int year,
			@PathVariable("shift") String shift) {
		return null;
	}

	@RequestMapping("/get/attendance/{bid}/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getStudentBlockAttendance(@PathVariable("sid") String studentId,
			@PathVariable("bid") String blockId) {
		return null;
	}

	@RequestMapping("/get/attendance/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getAllStudentsAttendance(@PathVariable("sid") String studentId) {
		return null;
	}

	@RequestMapping("/get/attendance/{fid}")
	public ResponseEntity<List<AttendanceDTO>> getfacultyStudentsBlockAttendance(
			@PathVariable("fid") String facultyId) {
		return null;
	}
}
