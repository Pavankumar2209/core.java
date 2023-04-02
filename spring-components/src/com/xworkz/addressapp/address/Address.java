package com.xworkz.addressapp.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Address {
	
	@Value("India")
	private String countryName;
	
	@Autowired  //dependency injection , autowired internally called constructor and also create object for that class 
	private Country country ;

}
