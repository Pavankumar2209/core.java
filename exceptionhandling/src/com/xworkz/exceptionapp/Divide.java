package com.xworkz.exceptionapp;

public class Divide {


	public static void main(String args[]) {
		System.out.println("Main method started");
		
		divide(1,0);
		System.out.println("Main method ended");
		
		
		
	}
	
	private static void divide(int i , int j) {
		System.out.println("Divide method started");
		/*System.out.println(i/j);
		System.out.println("Divide method ended");*/
		
		
		//  exception handling
		try {
			System.out.println(i/j);
		}catch(ArithmeticException b) {
			System.out.println("Can not divide given number by zero");
		}
		System.out.println("Divide method ended");
	}
	
}
