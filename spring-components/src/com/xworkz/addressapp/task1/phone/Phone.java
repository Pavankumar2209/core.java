package com.xworkz.addressapp.task1.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Phone {
	
	@Value("Poco X4  pro5G")
	private String brand;
	
	@Autowired
	private Application application;
	

}
