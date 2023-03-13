package com.xworkz.functionapp;

public class MultiplicationTester {
	
	public static void main(String[] args) {
		
	Multiplication multip	=(num1 , num2) -> {
		
	System.out.println(" start of multi method");
	System.out.println(num1*num2);
	System.out.println("End of multi method");
	};
	
	multip.multi(20, 5);
	}
}
