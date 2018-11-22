package edu.mum.waa.tmattendanceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import edu.mum.waa.tmattendanceservice.domain.Faculty;
import edu.mum.waa.tmattendanceservice.domain.Location;
import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.TMAttendance;
import edu.mum.waa.tmattendanceservice.service.AcademicCalendarService;
import edu.mum.waa.tmattendanceservice.service.AdminService;
import edu.mum.waa.tmattendanceservice.service.BlockService;
import edu.mum.waa.tmattendanceservice.service.EntryService;
import edu.mum.waa.tmattendanceservice.service.FacultyService;
import edu.mum.waa.tmattendanceservice.service.LocationService;
import edu.mum.waa.tmattendanceservice.service.StudentService;
import edu.mum.waa.tmattendanceservice.service.TMAttendanceService;

@SpringBootApplication
public class TmAttendanceServiceApplication implements CommandLineRunner {

	@Autowired
	StudentService studentService;
	@Autowired
	LocationService locationService;
	@Autowired
	TMAttendanceService tmAttendanceService;
	@Autowired
	RestTemplate restTemplate2;
	@Autowired
	AdminService adminService;
	@Autowired
	BlockService blockService;
	@Autowired
	EntryService entryService;
	@Autowired
	AcademicCalendarService academicCalendarService;

	@Autowired
	FacultyService facultyService;

	public static void main(String[] args) {
		SpringApplication.run(TmAttendanceServiceApplication.class, args);
	}

	// @Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setStudentId("108191");
		student.setFirstName("Samuel");
		student.setLastName("Paulos");
		student.setEmail("spaulos@mum.edu");
		student.setPhone("323545676");
		studentService.createStudent(student);

		Faculty faculty = new Faculty();
		faculty.setFacultyId("TF003");
		faculty.setFirstName("Tina");
		faculty.setLastName("Xing");
		faculty.setEmail("tina@mum.edu");
		faculty.setPhone("323546789");
		facultyService.createFaculty(faculty);
		
		Location location = new Location();
		location.setLocationId("DLB");
		location.setLocationName("Dolby Hall");
		locationService.createLocation(location);
		
		TMAttendance att = new TMAttendance();
		att.getSerialNumber();
		att.setDate("2018-11-20");
		att.setShift("AM");
		att.setLocation(location);
		att.setStudent(student);
		tmAttendanceService.createTMAttendance(att);

//		Block block = blockService.readBlock("WAA-11A-2018");
//		System.out.println(block.getBlockName());
//		Entry entry = new Entry(block);
//		entry.setEntryId("Feb2018");
//		entry.setStartDate(LocalDate.now());
//		entry.setEndDate(LocalDate.now());
//		entry.setEpochStartWeek("Week X");
//		entry.setEpochEndWeek("Week X+4");
//		entryService.createEntry(entry);
//
//		AcademicCalendar acad = new AcademicCalendar(entry);
//		acad.setCalendarId("AC-2018");
//		acad.setYear(2018);
//		academicCalendarService.createAcademicCalendar(acad);
//
//		Admin admin = new Admin(acad);
//		admin.setAdminId(001);
//		admin.setFirstName("John");
//		admin.setLastName("Hagelin");
//		adminService.createAdmin(admin);
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<Student> entity = new HttpEntity<Student>(student, headers);
//		Student result = restTemplate2
//				.exchange("http://localhost:8080/student/create", HttpMethod.POST, entity, Student.class).getBody();
//		 assertEquals(student, result);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
