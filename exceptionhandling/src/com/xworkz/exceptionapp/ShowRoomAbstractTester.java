package com.xworkz.exceptionapp;

import java.util.Scanner;

import com.xworkz.exceptionapp.exception.ManagerDataNotUpdatedException;
import com.xworkz.exceptionapp.exception.ManagerNotFoundException;
import com.xworkz.exceptionapp.manager.Manager;
import com.xworkz.exceptionapp.showroom.KtmshowRoomImpl;
import com.xworkz.exceptionapp.showroom.ShowRoomAbstract;

public class ShowRoomAbstractTester {
	
	public static void main(String[] args) {
		System.out.println("main method started");

		//for giving data in run time we use scanner class or object .
	
		Scanner scanner = new Scanner(System.in); //scanner object is created.
	
		System.out.println("Enter the Size");
		int size = scanner.nextInt();
		ShowRoomAbstract room = new KtmshowRoomImpl(size);
		
		for(int i=0; i<size; i++) {
			
			Manager manag= new Manager();
			
		System.out.println("Enter thr manager id");
		int managerId = scanner.nextInt(); 
		manag.setManagerId(managerId);
		
		System.out.println("Enter thr manager Manager name");
		manag.setManagerName(scanner.next());
		
		
		System.out.println("Enter the manager Address");
		String address = scanner.next();
		manag.setAddress(address);
		
		
		System.out.println("Enter the Manager Qualification");
		String qualification = scanner.next();
		manag.setQualification(qualification);
		
		System.out.println("Enter the manager Contact No");
		long contactNo = scanner.nextLong();
		manag.setContactNo(contactNo);
		
		System.out.println("Enter the Manager gender");
		String gender = scanner.next();
		manag.setGender(gender);
		

		//Manager manag1= new Manager(2,"Manoj","Rajajinagar", "B.com", 9876542222l,"Male");
		//Manager manag2= new Manager(3,"Kruthika","Banashankari", "MBA", 9988776655l,"Female");
		
		room.saveManager(manag);
		//room.saveManager(manag1);
		//room.saveManager(manag2);
		}
		
		room.getManager();
		System.out.println("Main method ended");
		scanner.close();
		
	
		// handling the exception
		try {
			room.getManagerByManagerQualification("B.com");
			
			room.getManagerByManagerAddress("Vijayanagar");
			
			room.getManagerByContactNo(9876542222l);
			
			room.getManagerByManagerName("Pavan");
			
			room.getManagerByManagerGender("Female");
			
			room.updateManagerContactNoById(8899775522l, 2);
			
			//handled two exceptions in single catch block
		} catch (ManagerNotFoundException | ManagerDataNotUpdatedException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {								//finally block is used to close all the costly resources in program.
			
			System.out.println("Inside finally block .....which will execute any time");
			if(scanner != null) {
				scanner.close();
			}
			
		}
		
		
	}

}
