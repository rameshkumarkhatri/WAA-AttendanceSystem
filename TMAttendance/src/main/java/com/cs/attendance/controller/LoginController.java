package com.cs.attendance.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs.attendance.domain.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
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
			return "login";
		}
		
		
 		return "login";
	}
}
