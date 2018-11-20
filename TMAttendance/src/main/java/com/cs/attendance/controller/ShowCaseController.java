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
@RequestMapping("/show")
public class ShowCaseController {
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public String login( ) {
 		return "showCase";
	}
 
	
}