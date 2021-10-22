package com.cal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalAppController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResultPage() {
		return "result-page";
	}
}
