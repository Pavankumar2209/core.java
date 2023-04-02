package com.xworkz.addressapp.task1.bar;

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
public class Bar {
		
		@Value("Pooja Bar ")
		private String barName;
		
		@Autowired
		private Waiter waiter;
		
		
}
