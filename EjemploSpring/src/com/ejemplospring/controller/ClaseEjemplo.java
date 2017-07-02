package com.ejemplospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClaseEjemplo {

	@RequestMapping("/welcome2")
	public ModelAndView holaMundo(){
		
		String mensaje = "HOLA MUNDO!!!";
		//return new ModelAndView("welcome","message",mensaje);
		return new ModelAndView("pruebajsp","message",mensaje);
	}
}
