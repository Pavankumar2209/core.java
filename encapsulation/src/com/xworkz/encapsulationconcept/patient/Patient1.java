package com.xworkz.encapsulationconcept.patient;


// using lombok to eliminate the write getter and setter methods

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Patient1 {
	
	//Encapsulation : 
	private int patientId;
	private String patientName;
	private String bloodGroup;
	private int age;
	private String gender;
	
	public Patient1() {
		// default constructor is created.
	}
	
	public Patient1(int patientId, String patientName, int age, String bloodGroup, String gender){
			
			this.patientId=patientId;
			this.patientName=patientName;
			this.age=age;
			this.bloodGroup = bloodGroup;
			this.gender=gender;
		
	}
	
													//getter and setter method helps us to make variables public 
	/*
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getPatientId() {
		return patientId;
	}
	
	
	public void setPatientName(String patientName) {
		this.patientName= patientName;
	}
	public String getPatientName() {
		return patientName;
	}
	
	
	public void setPatientAge(int age) {
		this.age=age;
	}
	public int getPatientAge() {
		return age;
	}
	
	

	public void setBloodgroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
	return gender;
	}*/
	
}
