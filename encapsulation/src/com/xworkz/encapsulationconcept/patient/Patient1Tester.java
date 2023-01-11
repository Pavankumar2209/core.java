package com.xworkz.encapsulationconcept.patient;
import java.util.Scanner;
public class Patient1Tester {
	
	
	public static void main(String[] args) {
		
		Patient1 patient = new Patient1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient Id");
		patient.setPatientId(sc.nextInt());
		
		System.out.println("Enter Patient Name");
		patient.setPatientName(sc.next());
		
		System.out.println("Enter Patient Age");
		patient.setPatientAge(sc.nextInt());
		
		System.out.println("Enter Patient BloodGroup");
		patient.setBloodgroup(sc.next());
		
		System.out.println("Enter patient gender");
		patient.setGender(sc.next());
		
		System.out.println(patient.getPatientId()+" "+patient.getPatientName()+" "+patient.getPatientAge()+" "+patient.getBloodGroup()+" "+patient.getGender());
		
		
		sc.close();
		
	}

}
