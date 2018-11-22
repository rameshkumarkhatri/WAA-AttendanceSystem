package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.AcademicCalendar;
import edu.mum.waa.tmattendanceservice.repository.AcademicCalendarRepository;
import edu.mum.waa.tmattendanceservice.service.AcademicCalendarService;

@Service
public class AcademicCalendarServiceImpl implements AcademicCalendarService {

	@Autowired
	AcademicCalendarRepository academicCalendarRepository;

	@Override
	public AcademicCalendar createAcademicCalendar(AcademicCalendar academicCalendar) {
		return academicCalendarRepository.save(academicCalendar);
	}

	@Override
	public AcademicCalendar readAcademicCalendar(String academicCalendarId) {
		return academicCalendarRepository.findById(academicCalendarId).get();
	}

	@Override
	public AcademicCalendar updateAcademicCalendar(AcademicCalendar academicCalendar) {
		return academicCalendarRepository.save(academicCalendar);
	}

	@Override
	public AcademicCalendar deleteAcademicCalendar(String academicCalendarId) {
		AcademicCalendar academicCalendar = readAcademicCalendar(academicCalendarId);
		academicCalendarRepository.delete(academicCalendar);
		return academicCalendar;
	}

}
