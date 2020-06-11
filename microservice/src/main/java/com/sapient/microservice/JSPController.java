package com.sapient.microservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JSPController {

	@GetMapping("/start")
	public String welcome(ModelMap m) {
		return "hello";
	} 
	
}
