package com.kgitbank.practice;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kgitbank.model.Human;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(
			value = {"/minsu", "/�μ�"},
			method = {
				RequestMethod.GET,
				RequestMethod.POST,
				RequestMethod.DELETE
			}
	)
	public String minsu() {
		log.info("minsu controller�� ����");
		
		return "/hello/minsu";
	}
	
	
	@RequestMapping("/chulsu")
	public void getChulsu(
			Human human, 
			@RequestParam("num") int myNum,
			@RequestParam("taste") ArrayList<String> taste) {
		log.info("chulsu controller�� ����");
		log.info("name : " + human.getName());
		log.info("age : " + human.getAge());
		log.info("myNum : " + myNum);
		log.info(taste);
	}
	
//	@PostMapping("/chulsu")
//	public void postchulsu() {
//		log.info("post chulsu");
//	}
	
	@GetMapping("/choo")
	public String choo(
			Model model, 
			@ModelAttribute("age")int age,
			@ModelAttribute("name") String name
		) {
		// �Ķ���Ϳ� �Ƿ��� ���� �Ű������� ����ְ�� �� ��Ʈ����Ʈ���� �ڵ����� �Ƿ��ִ�
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		
		model.addAttribute("attr1","ABC");
		model.addAttribute("ABCDEFG");
		
		return "/hello/attrTest";
	}
	
	@GetMapping("/park")
	public void park(Human human) {

	}
	
	
	@GetMapping("/kim")
	public String kim() {
		// �տ� redirect:�� ���̸� �並 ã�� �ʰ� �����̷�Ʈ�� �����Ѵ�
		return "redirect:/hello/park?name=Kim&age=321";
	}

	@RequestMapping("/model1")
	public ModelAndView mandv() {
		ModelAndView mnv = new ModelAndView();
		
		mnv.addObject("a", 10);
		mnv.addObject("b", "string");
		mnv.addObject("Integer");
		
		mnv.setViewName("/hello/mnv");
		
		return mnv;
	}
	
	@PostMapping("/join")
	public void postjoin() {
		log.info("post chulsu");
	}
	
	
}






























