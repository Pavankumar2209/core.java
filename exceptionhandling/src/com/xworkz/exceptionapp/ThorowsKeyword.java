package com.xworkz.exceptionapp;

public class ThorowsKeyword {					//throws exception
	
	//in throws keyword class we are nit handling the exception we avodinig the solution 
	
	public static void main(String[] args) {
		/*Note:  we can throw exception for main method also at at that time 
		main method will  started but it can not be get ended at main method*/
		
		//if we not handled the exception in main method then default handler will handle the exception.
		//default handler will terminate the program. or 
		//if catch is not found by jvm then program will not get terminated also jvm will call default handler(thus program got terminated abdraptly.
		
		System.out.println("Main method started ");
		
		
		// here we handling the exception by using try and catch method. inside main method
		//m1 calling 
		try {
			m1();
		} catch (ClassNotFoundException | NullPointerException e) {  // we can use multiple exception in single catch
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main method ended");
		
	}
	
	
	//we are using "throws" keyword bcz here we are not willing to handle the exception. so that we are throw that exception to next method
	//syantax : method name throws exception name.
	
	 //created method m1 and its a caller method for m2
	public static  void m1() throws ClassNotFoundException, NullPointerException {    //deligated(transfered) the exception to main method
		
		System.out.println("m1 method started");
		m2();
		System.out.println("m1  method ended");
	}
	
	
	//created method m2 and its a caller method for m3
	public static void m2() throws ClassNotFoundException , NullPointerException{   //deligated(transfered) the exception to m1
		
		System.out.println("m2 method started");
		m3();
		System.out.println("m2  method ended");
	}
	
	
	//created method m3 and its a called  method
	public static void m3() throws ClassNotFoundException , NullPointerException {  //deligated(transfered) the exception to m2
		
		System.out.println("m3 method started");
		
		String str = null;  // when we use null as value for string we get nullPointerException
		System.out.println(str.charAt(6));
		
		
		//here we using forName method , whenever we use forName method we get ClassNotFound exception.
		Class.forName("com.xworkz.exceptionapp.ThorowsKeyword");
		
		System.out.println("m3  method ended");
	}

}
