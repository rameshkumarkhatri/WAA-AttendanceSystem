package edu.mum.waa.tmattendanceservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/")
	public String home() {
		return "homepage";
	}

	@RequestMapping("/login")
	public String login() {
		return "loginpage";
	}

	@PostMapping("/home")
	public String success() {
		return "mainpage";
	}

	@RequestMapping("/welcome-student")
	public String welcomeStudent() {
		return "welcome-student";
	}

	@RequestMapping("/welcome-faculty")
	public String welcomeFaculty() {
		return "welcome-faculty";
	}

	@RequestMapping("/welcome-admin")
	public String welcomeAdmin() {
		return "welcome-admin";
	}
	
	@RequestMapping("/new-student")
	public String newStudent() {
		return "new-student";
	}
}
