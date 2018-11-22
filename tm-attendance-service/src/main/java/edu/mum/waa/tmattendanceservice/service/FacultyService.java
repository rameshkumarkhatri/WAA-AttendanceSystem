package edu.mum.waa.tmattendanceservice.service;

import edu.mum.waa.tmattendanceservice.domain.Faculty;

public interface FacultyService {
	Faculty createFaculty(Faculty faculty);

	Faculty readFaculty(String facultyId);

	Faculty updateFaculty(Faculty faculty);

	Faculty deleteFaculty(String facultyId);
}
