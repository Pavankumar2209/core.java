package com.xworkz.exceptionapp.compiletimeexception;

import java.io.File;  //from io package , we used File class to create new class
import java.io.IOException;

public class Tester {

		public static void main(String[] args) {
			
			
			System.out.println("Main methoid started");
			
			
			//we added try and catch bcz we getting compile time exception
			try {
				
				//forname method is help us to load class in java 
				//forName method is static method 
				//forName method return class 
				Class cls = Class.forName("com.xworkz.exceptionapp.compiletimeexception.Tester");
				System.out.println(cls);
			} catch (ClassNotFoundException e) {    //class not found exception
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//creating new file for that we created object 
			File  file =  new File("myfile.text");
			
			//we getting FileNotFound compile time exception so we added try and catch method.
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Main method ended");
		}
		
		
	
}
