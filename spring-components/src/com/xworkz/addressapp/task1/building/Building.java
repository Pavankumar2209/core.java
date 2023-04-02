package com.xworkz.addressapp.task1.building;

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
public class Building {
	
	@Value("O-SEA")
	private String buildingName;
	
	@Autowired
	private Rooms rooms ;
	

}
