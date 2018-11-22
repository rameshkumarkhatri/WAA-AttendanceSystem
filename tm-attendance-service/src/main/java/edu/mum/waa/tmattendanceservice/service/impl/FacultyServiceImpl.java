package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.adapters.UserAdapater;
import edu.mum.waa.tmattendanceservice.domain.Faculty;
import edu.mum.waa.tmattendanceservice.domain.User;
import edu.mum.waa.tmattendanceservice.repository.FacultyRepository;
import edu.mum.waa.tmattendanceservice.service.FacultyService;
import edu.mum.waa.tmattendanceservice.service.RoleService;
import edu.mum.waa.tmattendanceservice.service.UserService;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	FacultyRepository facultyRepository;
	
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;

	@Override
	public Faculty createFaculty(Faculty faculty) {
		User user = UserAdapater.getUser(faculty);
		userService.createUser(user);
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty readFaculty(String facultyId) {
		return facultyRepository.findById(facultyId).get();
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}

	@Override
	public Faculty deleteFaculty(String facultyId) {
		Faculty faculty = readFaculty(facultyId);
		facultyRepository.delete(faculty);
		return faculty;
	}

}
