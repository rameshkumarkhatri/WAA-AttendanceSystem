package edu.mum.waa.tmattendanceservice.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Block {
	@Id
	private String blockId;
	private String blockName;
	private LocalDate startDate;
	private LocalDate endDate;

	private String epochStartWeek;
	private String epochEndWeek;

	private List<Student> studentList;
	private List<Faculty> facultyList;
	private Course course;

	public Block() {
		super();
	}

	public Block(Course course) {
		super();
		this.course = course;
		this.setBlockName(course.getCourseName() + "-" + startDate.getYear());
	}

	public Block(String blockId, String blockName, LocalDate startDate, LocalDate endDate, String epochStartWeek,
			String epochEndWeek, List<Student> studentList, List<Faculty> facultyList, Course course) {
		super();
		this.blockId = blockId;
		this.blockName = blockName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.epochStartWeek = epochStartWeek;
		this.epochEndWeek = epochEndWeek;
		this.studentList = studentList;
		this.facultyList = facultyList;
		this.course = course;
	}

	/**
	 * @return the blockId
	 */
	public String getBlockId() {
		return blockId;
	}

	/**
	 * @param blockId the blockId to set
	 */
	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	/**
	 * @return the blockName
	 */
	public String getBlockName() {
		return blockName;
	}

	/**
	 * @param blockName the blockName to set
	 */
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the epochStartWeek
	 */
	public String getEpochStartWeek() {
		return epochStartWeek;
	}

	/**
	 * @param epochStartWeek the epochStartWeek to set
	 */
	public void setEpochStartWeek(String epochStartWeek) {
		this.epochStartWeek = epochStartWeek;
	}

	/**
	 * @return the epochEndWeek
	 */
	public String getEpochEndWeek() {
		return epochEndWeek;
	}

	/**
	 * @param epochEndWeek the epochEndWeek to set
	 */
	public void setEpochEndWeek(String epochEndWeek) {
		this.epochEndWeek = epochEndWeek;
	}

	/**
	 * @return the studentList
	 */
	public List<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	/**
	 * @return the facultyList
	 */
	public List<Faculty> getFacultyList() {
		return facultyList;
	}

	/**
	 * @param facultyList the facultyList to set
	 */
	public void setFacultyList(List<Faculty> facultyList) {
		this.facultyList = facultyList;
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void addFaculty(Faculty faculty) {
		facultyList.add(faculty);
	}

}
