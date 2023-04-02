package com.xworkz.addressapp.internet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester_Spring {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		
		Internet inr = applicationContext.getBean(Internet.class);
		
		System.out.println(inr);
		
	}

}
