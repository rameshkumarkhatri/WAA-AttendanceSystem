package edu.mum.waa.tmattendanceservice.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Admin {
	@Id
	private long adminId;
	private String firstName;
	private String lastName;

	private List<AcademicCalendar> academicCalendarList;
	private List<TMAttendance> tmAttendanceList;

	public Admin(AcademicCalendar academicCalendar) {
		super();
		academicCalendarList = new ArrayList<>();
		academicCalendarList.add(academicCalendar);

		tmAttendanceList = new ArrayList<>();
	}

	public Admin(long adminId, String firstName, String lastName, List<AcademicCalendar> academicCalendarList,
			List<TMAttendance> tmAttendanceList) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.academicCalendarList = academicCalendarList;
		this.tmAttendanceList = tmAttendanceList;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the adminId
	 */
	public long getAdminId() {
		return adminId;
	}

	/**
	 * @param adminId the adminId to set
	 */
	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the academicCalendarList
	 */
	public List<AcademicCalendar> getAcademicCalendarList() {
		return academicCalendarList;
	}

	/**
	 * @param academicCalendarList the academicCalendarList to set
	 */
	public void setAcademicCalendarList(List<AcademicCalendar> academicCalendarList) {
		this.academicCalendarList = academicCalendarList;
	}

	/**
	 * @return the tmAttendanceList
	 */
	public List<TMAttendance> getTmAttendanceList() {
		return tmAttendanceList;
	}

	/**
	 * @param tmAttendanceList the tmAttendanceList to set
	 */
	public void setTmAttendanceList(List<TMAttendance> tmAttendanceList) {
		this.tmAttendanceList = tmAttendanceList;
	}

}
