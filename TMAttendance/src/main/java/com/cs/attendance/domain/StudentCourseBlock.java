package com.cs.attendance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "block_course_student")
public class StudentCourseBlock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1328107255364094918L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "course_id")
	private Long courseID;
	
	@Column(name = "student_id")
	private Long studentID;
	
	@Column(name = "block_id")
	private Long blockID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCourseID() {
		return courseID;
	}

	public void setCourseID(Long courseID) {
		this.courseID = courseID;
	}

	public Long getStudentID() {
		return studentID;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public Long getBlockID() {
		return blockID;
	}

	public void setBlockID(Long blockID) {
		this.blockID = blockID;
	}
	
	
	
	

}
