package com.kgitbank.service;

import org.springframework.stereotype.Component;

@Component
public class RockPaperScissors {

	private String[] result = {"��", "��", "��"};
	
	public String ver(String user) {
		return result[(int)(Math.random() * result.length)];
	}
}

