package com.pi3.scorewizard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	@RequestMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	@RequestMapping("/")
	public String login() {
		return "index";
	}
}