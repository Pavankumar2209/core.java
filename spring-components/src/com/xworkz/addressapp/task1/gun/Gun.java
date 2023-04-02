package com.xworkz.addressapp.task1.gun;

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
public class Gun {
	
	@Value("Hand Gun")
	private String gunType;
	
	@Autowired
	private Bullets bullets;
}
