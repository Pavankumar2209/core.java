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
		patient.setAge(sc.nextInt());
		
		System.out.println("Enter Patient BloodGroup");
		patient.setBloodGroup(sc.next());
		
		System.out.println("Enter patient gender");
		patient.setGender(sc.next());
		
		System.out.println(patient.getPatientId()+" "+patient.getPatientName()+" "+patient.getAge()+" "+patient.getBloodGroup()+" "+patient.getGender());
		
		
		sc.close();
		
	}

}
