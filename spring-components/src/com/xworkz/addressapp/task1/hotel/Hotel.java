package com.xworkz.addressapp.task1.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Hotel {
	
	@Value("shanthi Sagar")
	private String hotelName;
	
	@Autowired
	private Chef chef;
	

}
