package com.xworkz.aptitude1app;

import java.util.Scanner;

public class FindFactorialTester {
	
	

	public static void main(String[] args) {
		
		FindFactorial factorial= new FindFactorial();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to find tha factorial for the same");
		int num=sc.nextInt();
		int fact= factorial.fact(num);
		System.out.println("Factorial of "+num+" is "+ fact);	
		
	}
	
	
	
}
