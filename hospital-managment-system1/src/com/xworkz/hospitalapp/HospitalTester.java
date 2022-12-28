package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	
		public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		
		Patient patient = new Patient(1,"Vinay",65,"AB+", "Male");
		Patient patient1 = new Patient(2,"Naveen", 85, "O+", "Male");
		
		
		
		hospital.admit(patient);
		hospital.admit(patient1);
		hospital.getAllPatients();
		
		System.out.println("Get the Patient by PatientId");
		hospital.getPatientByPatientId(2);
		
		System.out.println("patientAge is updating by using PatientId");
		hospital.updatePatientAgeByPatientIdI(70, 1);
		hospital.getPatientByPatientId(1);
		
		System.out.println("Patient Name is Updating By using Patient gender");
		hospital.updatePatientNameByPatientGender("Naveen M Gowda" , "Male");
		hospital.getPatientByPatientId(2);
		}

	}
