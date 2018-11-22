package edu.mum.waa.tmattendanceservice.adapters;

import edu.mum.waa.tmattendanceservice.domain.Admin;
import edu.mum.waa.tmattendanceservice.domain.Faculty;
import edu.mum.waa.tmattendanceservice.domain.Student;
import edu.mum.waa.tmattendanceservice.domain.User;

public class UserAdapater {
	public static User getUser(Student student) {
		User user = new User();
		user.setUserName(student.getFirstName());
		StringBuilder builder = new StringBuilder();
		builder.append(student.getPhone());
		builder.reverse();
		user.setPassword(builder.toString());
		user.setRole(student.getClass().getSimpleName().toUpperCase());
		return user;
	}

	public static User getUser(Faculty faculty) {
		User user = new User();
		user.setUserName(faculty.getFirstName());
		StringBuilder builder = new StringBuilder();
		builder.append(faculty.getPhone());
		builder.reverse();
		user.setPassword(builder.toString());
		user.setRole(faculty.getClass().getSimpleName().toUpperCase());
		return user;
	}

	public static User getUser(Admin admin) {
		User user = new User();
		user.setUserName(admin.getFirstName());
		StringBuilder builder = new StringBuilder();
		builder.append(admin.getFirstName());
		builder.reverse();
		user.setPassword(builder.toString());
		user.setRole(admin.getClass().getSimpleName().toUpperCase());
		return user;
	}
}
