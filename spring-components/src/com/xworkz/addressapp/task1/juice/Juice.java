package com.xworkz.addressapp.task1.juice;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.addressapp.task1.institute.Branches;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Juice {
	
	@Autowired
	private Fruits fruits ;

}
