package com.kgitbank.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kgitbank.model.Member;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/main")
public class JoinController {

	@RequestMapping(
			value = {"/join", "/Á¶ÀÎ"},
			method = {RequestMethod.POST}
	)
	public String join(Member mem) {
		log.info("join controller¿¡ µµÂø");
		
		System.out.println(mem.getId());
		System.out.println(mem.getPass());
		
		return "/user/join";
	}
	
}
