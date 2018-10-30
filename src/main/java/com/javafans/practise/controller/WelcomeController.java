package com.javafans.practise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {
	
	Logger logger=LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/" )
	public ModelAndView home() {
		
		return new ModelAndView("index");
	}
}
