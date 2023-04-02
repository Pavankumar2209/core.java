package com.xworkz.addressapp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.addressapp.address.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString

public class Person {
	
	@Value("1")
	private int id;
	
	@Value("Satish")
	private String name ;
	
	//has a relationship
	@Autowired
	private Address address;

}
