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
			value = {"/minsu", "/민수"},
			method = {
				RequestMethod.GET,
				RequestMethod.POST,
				RequestMethod.DELETE
			}
	)
	public String minsu() {
		log.info("minsu controller에 도착");
		
		return "/hello/minsu";
	}
	
	
	@RequestMapping("/chulsu")
	public void getChulsu(
			Human human, 
			@RequestParam("num") int myNum,
			@RequestParam("taste") ArrayList<String> taste) {
		log.info("chulsu controller에 도착");
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
		// 파라미터에 실려온 값이 매개변수에 들어있고ㅡ 모델 어트리뷰트에도 자동으로 실려있다
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
		// 앞에 redirect:을 붙이면 뷰를 찾지 않고 리다이렉트를 응답한다
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






























