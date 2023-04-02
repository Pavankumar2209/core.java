package com.xworkz.addressapp.internet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.val;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Browser  {
	@Value("Google chrome")
	private String browserName1;
	
	@Value("Firefox")
	private String browserName2;
	
	@Value("Microsoft Edge")
	private String browaerName3;

}
