package com.cs.attendance.domain;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;
	private String studentID;

	private List<Attendance> attendance;
	
	
	
	public Student(String first_name, String last_name, String student_id, List<Attendance> attendance) {
		this.firstName = first_name;
		this.lastName = last_name;
		this.studentID = student_id;
		this.attendance = attendance;
	}
	public List<Attendance> getAttendance() {
		return attendance;
	}
	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	
}
