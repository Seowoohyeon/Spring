package com.kgitbank.service;

import org.springframework.stereotype.Component;

@Component
public class DRoll {

private String[] result = {"��", "��", "��"};
	
	public String ver(String user) {
		return result[(int)(Math.random() * result.length)];
	}

}
