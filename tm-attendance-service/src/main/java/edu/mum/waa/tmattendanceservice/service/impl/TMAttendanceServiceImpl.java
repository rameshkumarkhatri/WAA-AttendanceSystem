package edu.mum.waa.tmattendanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.repository.TMAttendanceRepository;
import edu.mum.waa.tmattendanceservice.service.TMAttendanceService;

@Service
public class TMAttendanceServiceImpl implements TMAttendanceService {

	@Autowired
	TMAttendanceRepository tmAttendanceRepository;

	@Override
	public TMAttendance createTMAttendance(TMAttendance tmAttendance) {
		// TODO Auto-generated method stub
		return tmAttendanceRepository.save(tmAttendance);
	}

	@Override
	public TMAttendance getAttendance(String studentId) {
		// TODO Auto-generated method stub
		long id = 123L;
		return tmAttendanceRepository.findById(id).get();
	}

}
