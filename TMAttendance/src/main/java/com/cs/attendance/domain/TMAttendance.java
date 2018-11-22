package com.cs.attendance.domain;

import java.time.LocalDate;

public class TMAttendance {

	private long serialNumber;
	private LocalDate dateAdTime;
	private String shift;
	private Student student;

	public TMAttendance() {
		super();
	}

	public TMAttendance(long serialNumber, LocalDate dateAdTime, String shift, Student student) {
		super();
		this.serialNumber = serialNumber;
		this.dateAdTime = dateAdTime;
		this.shift = shift;
		this.student = student;
	}

	/**
	 * @return the serialNumber
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the dateAdTime
	 */
	public LocalDate getDateAdTime() {
		return dateAdTime;
	}

	/**
	 * @param dateAdTime the dateAdTime to set
	 */
	public void setDateAdTime(LocalDate dateAdTime) {
		this.dateAdTime = dateAdTime;
	}

	/**
	 * @return the shift
	 */
	public String getShift() {
		return shift;
	}

	/**
	 * @param shift the shift to set
	 */
	public void setShift(String shift) {
		this.shift = shift;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

}
