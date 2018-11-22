package edu.mum.waa.tmattendanceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.waa.tmattendanceservice.domain.Admin;
import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.dto.AttendanceDTO;
import edu.mum.waa.tmattendanceservice.proxy.TMProxy;
import edu.mum.waa.tmattendanceservice.service.AdminService;
import edu.mum.waa.tmattendanceservice.service.TMAttendanceService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	TMAttendanceService tmAttendanceService;
	@Autowired
	TMProxy tmProxy;
	@Autowired
	AdminService adminService;

	@RequestMapping("/attendance/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") String studentId) {
		return new ResponseEntity<>(tmProxy.getStudent(studentId), HttpStatus.OK);
	}

	@RequestMapping("/attendance/delete/{sid}")
	public ResponseEntity<String> deleteTMAttendance(@PathVariable("sid") String studentId) {

		return new ResponseEntity<String>("TMAttendance for student deleted successfully", HttpStatus.OK);
	}

	@PutMapping("/attendance/update/{sid}")
	public ResponseEntity<String> updateTMAttendance(@PathVariable("sid") String studentId,
			@RequestBody TMAttendance tmAttendance) {

		return new ResponseEntity<String>("TMAttendance for student updates successfully", HttpStatus.OK);
	}

	@PostMapping("/attendance/create")
	public ResponseEntity<String> createTMAttendance(@RequestBody TMAttendance tmAttendance) {
		TMAttendance Attendance = tmAttendanceService.createTMAttendance(tmAttendance);
		Student student = Attendance.getStudent();
		return new ResponseEntity<String>("TMAttendance for student " + student.getStudentId() + ":"
				+ student.getFirstName() + " registered successfully", HttpStatus.OK);
	}

	@RequestMapping("/attendance/get/{id}/{year}/{month}/{date}/{shift}")
	public ResponseEntity<AttendanceDTO> getStudentAttendace(@PathVariable("id") String studentId,
			@PathVariable("date") int date, @PathVariable("month") int month, @PathVariable("year") int year,
			@PathVariable("shift") String shift) {
		return null;
	}

	@RequestMapping("/attendance/get/{bid}/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getStudentAdminAttendance(@PathVariable("sid") String studentId,
			@PathVariable("bid") String adminId) {
		return null;
	}

	@RequestMapping("/get/attendance/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getAllStudentsAttendance(@PathVariable("sid") String studentId) {
		return null;
	}

	@RequestMapping("/attendance/get/{fid}")
	public ResponseEntity<List<AttendanceDTO>> getfacultyStudentsAdminAttendance(
			@PathVariable("fid") String facultyId) {
		return null;
	}

	@PostMapping("/create")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.createAdmin(admin), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Admin> getAdmin(@PathVariable("sid") long adminId) {
		return new ResponseEntity<Admin>(adminService.readAdmin(adminId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.updateAdmin(admin), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable("sid") long adminId) {
		return new ResponseEntity<Admin>(adminService.deleteAdmin(adminId), HttpStatus.OK);
	}
}
