package edu.mum.waa.tmattendanceservice.proxy;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.dto.AttendanceDTO;

@Service
public class TMProxy {

	@Autowired
	RestTemplate restTemplate;

	public Student getStudent(String studentId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<TMAttendance> entity = new HttpEntity<TMAttendance>(headers);
		List<AttendanceDTO> dtoList = restTemplate.exchange("http://localhost:8080/student/get/attendance/123",
				HttpMethod.GET, entity, new ParameterizedTypeReference<List<AttendanceDTO>>() {
				}).getBody();
		return dtoList.get(0).getStudent();

	}

//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
}
