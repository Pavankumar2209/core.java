package com.xworkz.functionapp;

public class SubstractionTester {
	
	public static void main(String[] args) {
		
	Substraction subs	=(num1,num2) -> {
	
		System.out.println("Start of sub method");
		System.out.println(num1-num2);
		System.out.println("End of sub method");
		
	};
	
		
		subs.sub(55, 10);
	}

}
