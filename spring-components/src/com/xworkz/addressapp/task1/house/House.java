package com.xworkz.addressapp.task1.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class House {
	
	@Value("Kushi Nilaya")
	private String houseName;
	
	@Autowired
	private Doors doors;

	
}
