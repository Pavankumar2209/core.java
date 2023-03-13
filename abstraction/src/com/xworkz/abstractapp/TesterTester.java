package com.xworkz.abstractapp;

public class TesterTester {
	
	public TesterTester() {   //stack over flow error found in this program : because we call the constructer  inside constructer.
		
		//this();   here we get compile time error bcz 
		System.out.println(this.getClass().getSimpleName()+"Object is created");
		TesterTester testertester= new TesterTester();
		System.out.println(testertester);	
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method Started");
		
		TesterTester testertester= new TesterTester();
		System.out.println(testertester);
		System.out.println("Main method ended");
		
		
		
	}

}
