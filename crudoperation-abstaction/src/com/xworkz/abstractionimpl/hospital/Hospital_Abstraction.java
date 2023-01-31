package com.xworkz.abstractionimpl.hospital;

import com.xworkz.abstractionimpl.patient.Patient;


public interface Hospital_Abstraction {
	
	public boolean addpatient(Patient patient);
	
	public void getAllPatients();
		
	public Patient getPatientByPatientId(int patientId);
	
	public boolean updatePatientAgeByPatientIdI(int newAge, int patientId);
		
	public boolean updatePatientNameByPatientGender(String patientNewName, String gender);
		
		

		
}
