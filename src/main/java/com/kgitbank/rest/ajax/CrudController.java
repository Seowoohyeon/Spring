package com.kgitbank.rest.ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/crud")
@Controller
public class CrudController {

	@GetMapping("/")
	public String home() {
		return "/ajax/employee_home";
	}
	
}
