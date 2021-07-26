package com.kgitbank.quiz;

import org.springframework.stereotype.Component;

@Component
public class Prime {
	public boolean isPrime(int num) {
		
		return num % 2 == 0 ? true : false;
	}
	
	public void veryAwesomeFunction(int num) throws ClassNotFoundException {
	      if (num > 0) {
	         throw new ClassNotFoundException();
	      }
	   }
}
