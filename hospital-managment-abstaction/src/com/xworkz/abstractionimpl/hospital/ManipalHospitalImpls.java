package com.xworkz.abstractionimpl.hospital;

import com.xworkz.abstractionimpl.patient.Patient;

public class ManipalHospitalImpls implements Hospital_Abstraction {

	Patient patient[];
	int index;
	
	 public ManipalHospitalImpls() {
		
	} 
	 
	 public ManipalHospitalImpls(int size) {
		 
		 patient = new Patient[size];
	 }
	
	@Override
	public boolean addpatient(Patient patient) {
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

	
	@Override
	public void getAllPatients() {
		for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].getPatientId()+" "+patient[i].getPatientName() +" "+ patient[i].getBloodGroup()+ " "+patient[i].getAge()+ " "+patient[i].getGender());
			}
		
	}

	@Override
	public Patient getPatientByPatientId(int patientId) {
		
			System.out.println(" getPatient By PatientId Method Started");
		
			for(int in=0;in<patient.length;in++) {
				if(patient[in].getPatientId()==patientId) {
					System.out.println("Patient Id is matching...Proceed the data");
					System.out.println(patient[in].getPatientId()+" "+patient[in].getPatientName()+" "+patient[in].getBloodGroup()+" "+patient[in].getAge()+" "+patient[in].getGender());
					return patient[in];	
				}
			}
			System.out.println("end of getPatient By PatientId Method");
		return null;
		}

	
	
	@Override
	public boolean updatePatientAgeByPatientIdI(int newAge, int patientId) {
		
			boolean isAgeUpdate=false;
			System.out.println("update PatientAge ByPatientId method is started");
		for(int ind=0;ind<patient.length;ind++) {
			if(patient[ind].getPatientId()==patientId) {
				System.out.println("The current age of the patient is:"+patient[ind].getAge());
				patient[ind].setAge(newAge);
				System.out.println("The new age of the Patient is:"+patient[ind].getAge());
				
				
			}
				
		}
		System.out.println("update PatientAge By PatientId method is Ended");
		return isAgeUpdate;
	}

	
	@Override
	public boolean updatePatientNameByPatientGender(String patientNewName, String gender) {
		
			
			boolean ispatientNameUpdate=false;
			System.out.println("update PatientName By Gender Method is Started");
		for(int i1=0; i1<patient.length; i1++) {
				if(patient[i1].getGender().equals(gender)) {
					System.out.println("The patient current name is:"+patient[i1].getPatientName());
					patient[i1].setPatientName(patientNewName);
					System.out.println("The New Name of the Patient is:"+patient[i1].getPatientName());
				}else {System.out.println("Gender not Matched");}
			
		}
			System.out.println("update PatientName By Gender Method is Ended");
			//return ispatientNameUpdate;
			return ispatientNameUpdate;
	}
	
	
	
	
	

}
