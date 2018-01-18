package com.springMVC4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringHolaMundo {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Nuevo mensage";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/adios")
	public ModelAndView adios() {
 
		String message = "Nuevo mensage de adios";
		return new ModelAndView("adios", "message", message);
	}
}
