package com.example.cursosvirtuales.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class HomeWebController {
	
	@RequestMapping
	public String home() {
		return "/home";
	}
}
