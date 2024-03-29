package com.xworkz.exceptionapp;

import java.util.Scanner;

import com.xworkz.exceptionapp.exception.PatientDataNotUpdatedException;
import com.xworkz.exceptionapp.exception.PatientIdNotFoundException;
import com.xworkz.exceptionapp.hospital.Hospital;
import com.xworkz.exceptionapp.hospital.ManipalHospital;
import com.xworkz.exceptionapp.patient.Patient;



public class ManipalHospitalTester {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int size= sc.nextInt();
		
		//upcasting : here  created  object using parent class ,, 
		
		Hospital hospital = new ManipalHospital (size);
		
		
		/*Downcasting : here we created object with reference of parent object to onvoke child class methods in parentclass ,
		this comes under casting concept only */
		
		//we can not invoke child class methods from parents object reference in polymorphism but this is possibale by casting.
		
		ManipalHospital hosp=(ManipalHospital)hospital;
		
		
		for(int i=0; i<size; i++) {
			
			Patient pat = new Patient();
			
			System.out.println("Enter Patient Id");
			pat.setPatientId(sc.nextInt());
			
			System.out.println("Enter Patient Name");
			pat.setPatientName(sc.next());
			
			System.out.println("Enter Patient Blood Group");
			pat.setBloodGroup(sc.next());
			
			System.out.println("Enter Patient Age");
			pat.setAge(sc.nextInt());
			
			System.out.println("Enter Patient gender");
			pat.setGender(sc.next());
			
			hospital.admit(pat);
			
		}
		
			/*hospital.getAllPatients();
			hosp.canteen();*/
		
		int option = 0;
		 String a="yes";
		 //String b="";
		 
	do {
		
			
		//Switch concept : switch parameter must be same as option datatype and case must be same as option
			System.out.println("Enter 1 to get all patient");
			System.out.println("Enter 2  to get patient by Id");
			System.out.println("Enter 3 to update patient age by Id");
			System.out.println("Enter 4 to update patient name by gender");
			//System.out.println("Enter 5 to exit ");
			
			
			
			option = sc.nextInt();
			
			switch(option) {
			
			
			
			case 1:hospital.getAllPatients();
					System.out.println("Thank you for visiting us");
					break;
			
			
		
			case 2:System.out.println("Enter Patient id ");
			    	int id= sc.nextInt();
				try {
					hospital.getPatientByPatientId(id);
				} catch (PatientIdNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		//method called
			    	break;
			
			
			
			case 3: System.out.println("Enter the update age");
					int updateage = sc.nextInt();
					System.out.println("Enter the patient Id");
					int j= sc.nextInt();
				try {
					hospital.updatePatientAgeByPatientIdI(updateage, j);
				} catch (PatientDataNotUpdatedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  //method called
					break;
				
				
			case 4: System.out.println("Enter the newName");
					String newname=sc.next();
					System.out.println("Enter the Patient Gender");
					String gender=sc.next();
				try {
					hospital.updatePatientNameByPatientGender(newname, gender);
				} catch (PatientDataNotUpdatedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //method called
					break;
			 	
			default: System.out.println("Enter Valid Key/number"); 
					break;
			}
			
			System.out.println("Do you want to Continue : Yes/No");
			
			
			
				
		}while(a.equals(sc.next()));
	
	sc.close();
	}
		
}
