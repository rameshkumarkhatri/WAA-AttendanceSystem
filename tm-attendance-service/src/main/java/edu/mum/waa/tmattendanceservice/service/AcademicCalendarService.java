package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.AcademicCalendar;

public interface AcademicCalendarService {

	AcademicCalendar createAcademicCalendar(AcademicCalendar academicCalendar);

	AcademicCalendar readAcademicCalendar(String academicCalendarId);

	AcademicCalendar updateAcademicCalendar(AcademicCalendar academicCalendar);

	AcademicCalendar deleteAcademicCalendar(String academicCalendarId);

}
