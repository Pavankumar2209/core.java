package com.xworkz.exceptionapp.exception;



//custome chech=ked exception
public class EmailNotFoundException  extends Exception{
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Patient not found with given email id";
	}
	

}
