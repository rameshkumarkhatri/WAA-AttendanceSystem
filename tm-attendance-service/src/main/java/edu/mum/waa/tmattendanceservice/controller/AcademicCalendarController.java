package edu.mum.waa.tmattendanceservice.controller;

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

import edu.mum.waa.tmattendanceservice.domain.AcademicCalendar;
import edu.mum.waa.tmattendanceservice.service.AcademicCalendarService;

@RestController
@RequestMapping("/acalendar")
public class AcademicCalendarController {
	
	@Autowired
	AcademicCalendarService academicCalendarService;
	
	@PostMapping("/create")
	public ResponseEntity<AcademicCalendar> createAcademicCalendar(@RequestBody AcademicCalendar academicCalendar) {
		return new ResponseEntity<AcademicCalendar>(academicCalendarService.createAcademicCalendar(academicCalendar), HttpStatus.OK);
	}

	@RequestMapping("/read/{sid}")
	public ResponseEntity<AcademicCalendar> getAcademicCalendar(@PathVariable("sid") String academicCalendarId) {
		return new ResponseEntity<AcademicCalendar>(academicCalendarService.readAcademicCalendar(academicCalendarId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<AcademicCalendar> updateAcademicCalendar(@RequestBody AcademicCalendar academicCalendar) {
		return new ResponseEntity<AcademicCalendar>(academicCalendarService.updateAcademicCalendar(academicCalendar), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<AcademicCalendar> deleteAcademicCalendar(@PathVariable("sid") String academicCalendarId) {
		return new ResponseEntity<AcademicCalendar>(academicCalendarService.deleteAcademicCalendar(academicCalendarId), HttpStatus.OK);
	}
}
