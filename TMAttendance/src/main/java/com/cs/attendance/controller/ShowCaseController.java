package com.cs.attendance.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cs.attendance.domain.Login;
import com.cs.attendance.service.BlockService;
import com.cs.attendance.service.CourseService;
@Controller
@RequestMapping("/show")
public class ShowCaseController {
	
	@Autowired
	BlockService blockService;
	
	@Autowired
	CourseService courseService;
	
	
	@RequestMapping(value= {"/"}, method = RequestMethod.GET)
	public String show(Model model ) {
		model.addAttribute("blocks", blockService.getAll());
		model.addAttribute("courses", courseService.getAll());
 		return "showCase";
	}
 
	
}