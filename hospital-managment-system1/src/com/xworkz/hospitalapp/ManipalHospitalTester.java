package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.Hospital;

import com.xworkz.hospitalapp.hospital.ManipalHospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ManipalHospitalTester {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int size= sc.nextInt();
		Hospital hospital = new ManipalHospital (size);
		
		
		
		for(int i=0; i<size; i++) {
			
			Patient pat = new Patient();
			
			System.out.println("Enter Patient Id");
			pat.setPatientId(sc.nextInt());
			
			System.out.println("Enter Patient Name");
			pat.setPatientName(sc.next());
			
			System.out.println("Enter Patient Blood Group");
			pat.setPatientBloodGroup(sc.next());
			
			System.out.println("Enter Patient Age");
			pat.setAge(sc.nextInt());
			
			System.out.println("Enter Patient gender");
			pat.setGender(sc.next());
			
			hospital.admit(pat);
			
		}
		
			hospital.getAllPatients();
		
		
		
		
	}

}
