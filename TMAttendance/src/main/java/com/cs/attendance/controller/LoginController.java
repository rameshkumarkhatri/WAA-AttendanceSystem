package com.cs.attendance.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs.attendance.domain.Attendance;
import com.cs.attendance.domain.Login;
import com.cs.attendance.domain.User;
import com.cs.attendance.service.AttendanceService;
import com.cs.attendance.service.UserService;

@Controller
public class LoginController {
	
	
	@Autowired
	UserService userService;

	@Autowired
	AttendanceService attendaceService;
	
	@RequestMapping(value= {"/", "/login"}, method = RequestMethod.GET)
	public String login(@ModelAttribute("login") Login login ) {
//		User u = new User();
////		u.setId(0);
//		u.setPassword("admin123");
//		u.setUsername("admin123@mum.edu");
//		u.setUser_role("ADMIN");
//		
//		
//		System.out.println("User saved "+userService.save(u).toString());
		

		List<Attendance> att = attendaceService.findAllByStdBlockCourseId(1);
		
		for(Attendance a : att) {
			System.out.println(a.getId()+""+a.getLocation()+" "+a.getTime()+" "+a.getStd_block_course_id());
		}
 		return "login";
	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "login";
 	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginPost(@Valid @ModelAttribute("login") Login login, BindingResult bindResult, Model model ) {
		
		if(bindResult.hasErrors()) {
			System.out.println("Input user error "+bindResult.toString());
			return "login";
		}
		
		List<User> list = userService.getUsers();
		System.out.println("Users "+ list.toString());
		User user = userService.loginUser(login.getU_name());
		if(user == null || user.getId()<=0)
		{	
			model.addAttribute("error", "true");
			System.out.println("User null for email "+login.getU_name() +" password "+login.getPass());
			return "login";
		}
		if(user.getPassword().equals(login.getPass()))
 		return "redirect:/show/";
		else return "login";
	}
}
