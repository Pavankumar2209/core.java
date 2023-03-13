package com.xworkz.exceptionapp.hospital;

import com.xworkz.exceptionapp.exception.EmailNotFoundException;
import com.xworkz.exceptionapp.exception.PatientDataNotUpdatedException;
import com.xworkz.exceptionapp.exception.PatientIdNotFoundException;
import com.xworkz.exceptionapp.patient.Patient;

public class Hospital extends Object{   //object is a parent most class in a java  so it is optionla
	
				//using CRUD OPERATION CONCEPT to understand Opps
	
	
	Patient patient[];
	int index;
	
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(int size) {
		System.out.println("ShowRoom object is Creted");
		patient = new Patient[size];
	}
	
	
	
	/* this block of code is used before scanner object is used 
	  
	  Patient patient[] = new Patient[2]; //first we need to fix the size of the array , this is the drawback of array.
	int index;
	
	
		public Hospital() {
		
			System.out.println("Hospital object is created");
		}*/
	
		
		
		public boolean admit(Patient patient) {
				boolean isAdmitted = false;
				System.out.println("Inside admit method");
		
				if(patient.getPatientName() != null && patient.getPatientName() != "") 
				{
					this.patient[index++]= patient;
					System.out.println("Patient is sucessfully added to the hospital");
					isAdmitted = true ;
			
				}
				else {
				System.out.println("Patient name can not be null or empty");
				}
		return isAdmitted;
		}
		
		
	
		public void getAllPatients() {
			//using foreach to fetch all the data from array
			for(Patient pat:patient) {
				System.out.println(pat);
			}
			
			/*for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].getPatientId()+" "+patient[i].getPatientName() +" "+ patient[i].getBloodGroup()+ " "+patient[i].getAge()+ " "+patient[i].getGender());
			}*/
		
		}
	
		
		
		public Patient getPatientByPatientId(int patientId) throws PatientIdNotFoundException {
			System.out.println(" getPatient By PatientId Method Started");
		
			for(int in=0;in<patient.length;in++) {
				if(patient[in].getPatientId()==patientId) {
					System.out.println("Patient Id is matching...Proceed the data");
					System.out.println(patient[in].getPatientId()+" "+patient[in].getPatientName()+" "+patient[in].getBloodGroup()+" "+patient[in].getAge()+" "+patient[in].getGender());
					return patient[in];	
				}else{
						throw new PatientIdNotFoundException();
				}
			}
			System.out.println("end of getPatient By PatientId Method");
		return null;
		}
		
		
		
		public boolean updatePatientAgeByPatientIdI(int newAge, int patientId) throws PatientDataNotUpdatedException {
				boolean isAgeUpdate=false;
				System.out.println("update PatientAge ByPatientId method is started");
			for(int ind=0;ind<patient.length;ind++) {
				if(patient[ind].getPatientId()==patientId) {
					System.out.println("The current age of the patient is:"+patient[ind].getAge());
					patient[ind].setAge(newAge);
					System.out.println("The new age of the Patient is:"+patient[ind].getAge());
				
				}else {
					throw new PatientDataNotUpdatedException("Patient Age is Not Updated");
				}
					
			}
			System.out.println("update PatientAge By PatientId method is Ended");
			return isAgeUpdate;
		}
		
		
		
		public boolean updatePatientNameByPatientGender(String patientNewName, String gender) throws PatientDataNotUpdatedException {
			
				boolean ispatientNameUpdate=false;
				System.out.println("update PatientName By Gender Method is Started");
			for(int i1=0; i1<patient.length; i1++) {
					if(patient[i1].getGender().equals(gender)) {
						System.out.println("The patient current name is:"+patient[i1].getPatientName());
						patient[i1].setPatientName(patientNewName);
						System.out.println("The New Name of the Patient is:"+patient[i1].getPatientName());
					}else {
						throw new PatientDataNotUpdatedException("Patient Gender is Not Updated");
						
					}
			}
				System.out.println("update PatientName By Gender Method is Ended");
				//return ispatientNameUpdate;
				return ispatientNameUpdate;
		}
		
		
		// in this method we creating custom exception or user defined exception
		public Patient getPatientByEmail(String email) throws EmailNotFoundException{  // throws the exception to the next method or block
			System.out.println("Get patient by email id method started");
			for(int i=0; i<patient.length; i++) {
				if(patient[i].getEmail().equals(email)) {
					System.out.println("The oatient email id is matching.....proceed the data");
					System.out.println(patient[i]);
					return patient[i];
					
				}else {
					
					throw new EmailNotFoundException();   // here we done object creation of EmailNotFoundException class
				}
			}
			System.out.println("Get patiemt by Email method ended");
			return null;	
			
			
		}
		
		
	
}
