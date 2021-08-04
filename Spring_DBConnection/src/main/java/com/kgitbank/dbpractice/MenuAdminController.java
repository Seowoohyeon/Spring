package com.kgitbank.dbpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kgitbank.mapper.MenuMapper;
import com.kgitbank.model.Menu;
import com.kgitbank.service.MenuService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class MenuAdminController {

	@Autowired
	MenuService menu_service;


	@GetMapping("/menu/")
	public String main() {
		return "CRUD";
	}

	@GetMapping("/menu/add")
	public void addView() {
	}

	@PostMapping("/menu/add")
	public String addService(Menu m) {
		
		menu_service.addMenu(m);

		return "redirect:/menu/";
	}

}