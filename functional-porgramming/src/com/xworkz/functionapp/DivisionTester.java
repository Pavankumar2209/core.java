package com.xworkz.functionapp;

public class DivisionTester {

	public static void main(String[] args) {
	Division div	=(num1, num2) -> {
	
		System.out.println("Start of div method");
		System.out.println(num1/num2);
		System.out.println("End of div method");
		
	};
		div.divi(200, 20);
	}
	
}
