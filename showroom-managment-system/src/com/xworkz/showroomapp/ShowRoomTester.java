package com.xworkz.showroomapp;

import com.xworkz.showroomapp.manager.Manager;   //FQCN = fully qualified class name.

import com.xworkz.showroomapp.showroom.ShowRoom;

import java.util.Scanner;



public class ShowRoomTester {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		//for giving data in run time we use scanner class or object .
		
		
		Scanner scanner = new Scanner(System.in); //scanner object is created.
		System.out.println("Enter the Size");
		int size = scanner.nextInt();
		ShowRoom room = new ShowRoom(size);
		
		for(int i=0; i<size; i++) {
		System.out.println("Enter thr manager id");
		int managerId = scanner.nextInt(); 
		
		System.out.println("Enter thr manager Manager name");
		String managerName = scanner.next();
		
		System.out.println("Enter the manager Address");
		String address = scanner.next();
		
		System.out.println("Enter the Manager Qualification");
		String qualification = scanner.next();
		
		System.out.println("Enter the manager Contact No");
		long contactNo = scanner.nextLong();
		
		System.out.println("Enter the Manager gender");
		String gender = scanner.next();
		
		
		
		
		
		Manager manag= new Manager(managerId,managerName, address,  qualification,contactNo,gender);
		//Manager manag1= new Manager(2,"Manoj","Rajajinagar", "B.com", 9876542222l,"Male");
		//Manager manag2= new Manager(3,"Kruthika","Banashankari", "MBA", 9988776655l,"Female");
		
		room.saveManager(manag);
		//room.saveManager(manag1);
		//room.saveManager(manag2);
		}
		
		room.getManager();
		System.out.println("Main method ended");
		scanner.close();
		
	
		room.getManagerByManagerQualification("B.com");
		room.getManagerByManagerAddress("Vijayanagar");
		room.getManagerByContactNo(9876542222l);
		room.getManagerByManagerName("Pavan");
		room.getManagerByManagerGender("Female");
		room.updateManagerContactNoById(8899775522l, 3);
	}
}
	
	

