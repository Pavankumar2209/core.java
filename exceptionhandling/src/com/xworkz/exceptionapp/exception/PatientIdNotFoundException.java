package com.xworkz.exceptionapp.exception;

public class PatientIdNotFoundException  extends Exception {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "patient not found with the given id";
	}
	
	

}
