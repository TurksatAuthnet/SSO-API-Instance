package com.infybuzz.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("/contact-us")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("contact-us");
		return modelAndView;
	}
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}


	@GetMapping("/student")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("welcome");
		return modelAndView;
	}

	@GetMapping("/student-private")
	@PreAuthorize("hasAuthority('stajyer')")
	public ModelAndView studentPrivate() {
		ModelAndView modelAndView = new ModelAndView("welcome");
		return modelAndView;
	}


//	@GetMapping("/deneme")
//	public String deneme() {
//
//		return "hoşgeldiniz";
//	}

	
	@GetMapping("/manage-students")
	@PreAuthorize("hasAuthority('PROFESSOR')")
	//@PreAuthorize("hasAuthority('PROFESSOR') or hasAuthority('STUDENT')")
	public ModelAndView manageStudents() {
		ModelAndView modelAndView = new ModelAndView("manage-students");
		return modelAndView;
	}
	
	@GetMapping("/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView("access-denied");
		return modelAndView;
	}
}
