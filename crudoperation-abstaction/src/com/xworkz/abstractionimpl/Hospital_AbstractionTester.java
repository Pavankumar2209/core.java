package com.xworkz.abstractionimpl;

import java.util.Scanner;

import com.xworkz.abstractionimpl.hospital.*;
import com.xworkz.abstractionimpl.patient.*;

public class Hospital_AbstractionTester {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();			
		Hospital_Abstraction hospital = new ManipalHospitalImpls(size);
		
		for(int i=0; i<size;i++) {
		
				System.out.println("Enter PatientId");
				int patientIdNo= scanner.nextInt();
				
				System.out.println("Enter Patient Name");
				String name = scanner.next();
				
				System.out.println("Enter Patient Age");
				int age = scanner.nextInt();
				
				System.out.println("Enter patient Blood Group ");
				String bloodGroup = scanner.next();
				
				System.out.println("Enter Patient Gender");
				String gender = scanner.next();
				
				Patient patient = new Patient(patientIdNo,name, age,bloodGroup,gender);
				hospital.addpatient(patient);
				
				
		}
		
		hospital.getAllPatients();
		scanner.close();
		
		System.out.println("Get the Patient by PatientId");
		hospital.getPatientByPatientId(2);
		
		System.out.println("patientAge is updating by using PatientId");
		hospital.updatePatientAgeByPatientIdI(70, 1);
		hospital.getPatientByPatientId(1);
		
		System.out.println("Patient Name is Updating By using Patient gender");
		hospital.updatePatientNameByPatientGender("Naveen M Gowda" ,"male");
	}
}
