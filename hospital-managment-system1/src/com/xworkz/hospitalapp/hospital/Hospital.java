package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {
	
				//CRUD OPERATION CONCEPT 
	
	Patient patient[] = new Patient[2]; //first we need to fix the size of the array , this is the drawback of array.
	int index;
	
	
		public Hospital() {
		
			System.out.println("Hospital object is created");
		}
	
		
		
		public boolean admit(Patient patient) {
				boolean isAdmitted = false;
				System.out.println("Inside admit method");
		
				if(patient.patientName != null && patient.patientName != "") 
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
			for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].patientId+" "+patient[i].patientName +" "+ patient[i].bloodGroup+ " "+patient[i].age+ " "+patient[i].gender);
			}
		
		}
	
		
		
		public Patient getPatientByPatientId(int patientId) {
			System.out.println(" getPatient By PatientId Method Started");
		
			for(int in=0;in<patient.length;in++) {
				if(patient[in].patientId==patientId) {
					System.out.println("Patient Id is matching...Proceed the data");
					System.out.println(patient[in].patientId+" "+patient[in].patientName+" "+patient[in].bloodGroup+" "+patient[in].age+" "+patient[in].gender);
					return patient[in];	
				}
			}
			System.out.println("end of getPatient By PatientId Method");
		return null;
		}
		
		
		
		public boolean updatePatientAgeByPatientIdI(int newAge, int patientId) {
				boolean isAgeUpdate=false;
				System.out.println("update PatientAge ByPatientId method is started");
			for(int ind=0;ind<patient.length;ind++) {
				if(patient[ind].patientId==patientId) {
					System.out.println("The current age of the patient is:"+patient[ind].age);
					patient[ind].age=newAge;
					System.out.println("The new age of the Patient is:"+patient[ind].age);
					
					
				}
					
			}
			System.out.println("update PatientAge By PatientId method is Ended");
			return isAgeUpdate;
		}
		
		
		
		public boolean updatePatientNameByPatientGender(String patientNewName, String gender) {
				boolean ispatientNameUpdate=false;
				System.out.println("update PatientName By Gender Method is Started");
			for(int i1=0; i1<patient.length; i1++) {
					if(patient[i1].gender==gender) {
						System.out.println("The patient current name is:"+patient[i1].patientName);
						patient[i1].patientName=patientNewName;
						System.out.println("The New Name of the Patient is:"+patient[i1].patientName);
					}
				
			}
				System.out.println("update PatientName By Gender Method is Ended");
				return ispatientNameUpdate;			
		}
		
		
	
}
