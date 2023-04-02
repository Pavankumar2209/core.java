package com.xworkz.addressapp.springconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.addressapp.person.Person;

@Configuration
@ComponentScan(basePackages = "com.xworkz.addressapp")
public class SpringConfiguratinos {
	
	@Bean
	public Person getPerson() {
		
		return  new Person();
	}
	

}
