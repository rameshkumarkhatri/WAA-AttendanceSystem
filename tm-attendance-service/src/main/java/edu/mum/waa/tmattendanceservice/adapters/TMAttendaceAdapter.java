package edu.mum.waa.tmattendanceservice.adapters;

import java.util.ArrayList;
import java.util.List;

import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.dto.AttendanceDTO;

public class TMAttendaceAdapter {

	public static List<AttendanceDTO> get(TMAttendance attendance) {
		List<AttendanceDTO> list = new ArrayList<>();
		AttendanceDTO dto = new AttendanceDTO();
		dto.setSerialNumber(attendance.getSerialNumber());
		dto.setDate(attendance.getDate());
		dto.setShift(attendance.getShift());
		dto.setLocation(attendance.getLocation());
		dto.setStudent(attendance.getStudent());
		list.add(dto);
		return list;
	}

}
