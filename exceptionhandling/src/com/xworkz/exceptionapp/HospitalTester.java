package com.xworkz.exceptionapp;

import java.util.Scanner;

import com.xworkz.exceptionapp.exception.EmailNotFoundException;
import com.xworkz.exceptionapp.exception.PatientDataNotUpdatedException;
import com.xworkz.exceptionapp.exception.PatientIdNotFoundException;
import com.xworkz.exceptionapp.hospital.Hospital;
import com.xworkz.exceptionapp.patient.Patient;

import lombok.ToString;

public class HospitalTester {
	
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scanner.nextInt();			
		Hospital hospital = new Hospital(size);
		
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
				
				System.out.println("Enter Patient Email Id");
				String email = scanner.next();
				
				Patient patient = new Patient(patientIdNo,name, age,bloodGroup,gender,email);
				hospital.admit(patient);
				
				
		}
		
		hospital.getAllPatients();
		scanner.close();
		
		
		//here we handling the exception by try and catch block, 
		//handling multiple exceptions in single catch
		try {
			System.out.println("Get the Patient by PatientId");
			hospital.getPatientByPatientId(2);
			
			System.out.println("patientAge is updating by using PatientId");
			hospital.updatePatientAgeByPatientIdI(70, 1);
			
			System.out.println("Get the patient details by email id");
			hospital.getPatientByEmail("Kruthika@gmail.com");
			
			System.out.println("Patient Name is Updating By using Patient gender");
			hospital.updatePatientNameByPatientGender("Naveen M Gowda" ,"male");
			
		} catch (PatientIdNotFoundException | PatientDataNotUpdatedException | EmailNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			
			
			
		}
		
		System.out.println("Main method ended");
		
		/*    in this block of code , i am not used scanner object . bcz here we are givinig data before compilation time 
		  
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
		hospital.getPatientByPatientId(2);*/
		}

	}
