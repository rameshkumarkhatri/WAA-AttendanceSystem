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

import edu.mum.waa.tmattendanceservice.domain.Faculty;
import edu.mum.waa.tmattendanceservice.dto.AttendanceDTO;
import edu.mum.waa.tmattendanceservice.service.FacultyService;


@RestController
@RequestMapping("/faculty")
public class FacultyController {

	@RequestMapping("/get/attendance/{fid}")
	public ResponseEntity<List<AttendanceDTO>> getBlockAttendance(@PathVariable("fid") String facultyId) {
		return null;
	}
	
	@Autowired
	FacultyService facultyService;

	@PostMapping("/create")
	public ResponseEntity<Faculty> createFaculty(@RequestBody Faculty faculty) {
		return new ResponseEntity<Faculty>(facultyService.createFaculty(faculty), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<Faculty> getFaculty(@PathVariable("sid") String facultyId) {
		return new ResponseEntity<Faculty>(facultyService.readFaculty(facultyId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Faculty> updateFaculty(@RequestBody Faculty faculty) {
		return new ResponseEntity<Faculty>(facultyService.updateFaculty(faculty), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<Faculty> deleteFaculty(@PathVariable("sid") String facultyId) {
		return new ResponseEntity<Faculty>(facultyService.deleteFaculty(facultyId), HttpStatus.OK);
	}

}
