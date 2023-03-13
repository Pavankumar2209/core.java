package com.xworkz.exceptionapp.hospital;

import com.xworkz.exceptionapp.patient.Patient;

public class ManipalHospital extends Hospital{
	
	
	boolean isApplicationFormFilled = true;
	
	public ManipalHospital(int size) {
		
		patient =  new Patient[size];
		System.out.println("Manipal Hospital object is created");
		
	}
	
	@Override
	public boolean admit(Patient patient) {
		System.out.println("Inside admit Patine of Manipal Hospital");
		if(isApplicationFormFilled=true) {
			System.out.println("Appllication form is filled can add the patien now...");
			boolean isAdmitted = super.admit(patient);
			System.out.println("Patient admitted sucessfully");
			return isAdmitted;
		}
		return false;
	}
	
	//creating method 
	public void canteen() {
		System.out.println("Food is delicious");
	}
	

	
	


}
