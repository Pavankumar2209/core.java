package com.xworkz.functionapp;

public class AdditionTester {

	public static void main(String[] args) {
		
		//lambda expression is a anonymous function , which can be called without using access modifier. 
		//lambda expression is used to get reference of the functional interface.
		//using lambda expression symbol ( -> )  , return type of lambda expression is functional interface only
		
		//this is lambda expression 
	Addition addition	=(num1,num2) ->{  //use curly brackets after lambda expression to add multiple lines 
		
	System.out.println("start of add method");
	System.out.println(num1+num2);  
	System.out.println("End of add method");
	
	
	};
	addition.add(25, 50); 
	addition.add(35, 50);
	
	}
	// todays task is  buffer reader and lambda expression
}
