package com.xworkz.addressapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.addressapp.person.Person;
import com.xworkz.addressapp.springconfiguration.SpringConfiguratinos;

public class Tester_using_spring {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguratinos.class);
		
		Person test =  applicationContext.getBean(Person.class);
		
		System.out.println(test);
		
	}

}
