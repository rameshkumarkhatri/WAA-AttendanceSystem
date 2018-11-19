package com.cs.attendance.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class Login {
	
	@NotEmpty(message = "{Login.username.notEmpty}")
	@Email(message = "{Login.username.validEmail")
	private String u_name;
	
	@NotEmpty(message = "{Login.password.notEmpty}")
	@Length(min = 5, message = "{Login.password.length}")
	private String pass;
	
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}
