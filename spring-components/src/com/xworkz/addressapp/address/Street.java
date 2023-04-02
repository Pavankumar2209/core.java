package com.xworkz.addressapp.address;

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
public class Street {

	@Value("SSP Road")
	private String StreetName ;
	
	@Value("2nd cross , 5th main ")
	private String StreetNo ;
}
