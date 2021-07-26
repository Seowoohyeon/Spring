package com.kgitbank.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Market {

	private Fruit fruit;
	
	public Market() {
		
	}
	
	@Autowired
	public Market(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public Fruit getFruit() {
		return fruit;
	}
	
}
