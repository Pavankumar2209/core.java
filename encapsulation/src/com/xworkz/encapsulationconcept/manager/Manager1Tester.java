package com.xworkz.encapsulationconcept.manager;

import java.util.Scanner;

public class Manager1Tester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Manager1 manager = new Manager1();
		
		System.out.println("Enter ManagerId");
		int managerid = sc.nextInt(); 
		manager.setManagerId(managerid);
		
		System.out.println("Enter ManagerName");
		manager.setManagerName(sc.next());
		
		System.out.println("Enter Address");
		manager.setAddress(sc.next());
		
		System.out.println("Enter Qualification");
		manager.setQualification(sc.next());
		
		System.out.println("Enter Contact No");
		manager.setContactNo(sc.nextLong());
		
		System.out.println("Enter Gender");
		manager.setGender(sc.next());
		
		
		System.out.println(manager.getManagerId()+" "+manager.getManagerName()+" "+manager.getAddress()+" "+manager.getQualification()+" "+manager.getContactNo()+" "+manager.getGender());
		
		sc.close();
		
		
	}

}
