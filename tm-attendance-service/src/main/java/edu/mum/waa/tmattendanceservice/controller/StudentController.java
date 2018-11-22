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

import edu.mum.waa.tmattendanceservice.adapters.TMAttendaceAdapter;
import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.dto.AttendanceDTO;
import edu.mum.waa.tmattendanceservice.service.StudentService;
import edu.mum.waa.tmattendanceservice.service.TMAttendanceService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	TMAttendanceService tmAttendanceService;
	@Autowired
	StudentService studentService;

	@RequestMapping("/get/attendance/{id}/{year}/{month}/{date}/{shift}")
	public ResponseEntity<AttendanceDTO> getAttendace(@PathVariable("id") String studentId,
			@PathVariable("date") int date, @PathVariable("month") int month, @PathVariable("year") int year,
			@PathVariable("shift") String shift) {
		AttendanceDTO dto = TMAttendaceAdapter.get(studentService.find(studentId, date, month, year, shift)).get(0);
		return new ResponseEntity<AttendanceDTO>(dto, HttpStatus.OK);
	}

	@RequestMapping("/get/attendance/{bid}/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getBlockAttendance(@PathVariable("sid") String studentId,
			@PathVariable("bid") String blockId) {
		return null;
	}

	@RequestMapping("/get/attendance/{sid}")
	public ResponseEntity<List<AttendanceDTO>> getAllAttendance(@PathVariable("sid") String studentId) {
		return new ResponseEntity<List<AttendanceDTO>>(
				TMAttendaceAdapter.get(tmAttendanceService.getAttendance(studentId)), HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") String studentId) {
		return new ResponseEntity<Student>(studentService.readStudent(studentId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.updateStudent(student), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Student> deleteStudent(@PathVariable("sid") String studentId) {
		return new ResponseEntity<Student>(studentService.deleteStudent(studentId), HttpStatus.OK);
	}
}
