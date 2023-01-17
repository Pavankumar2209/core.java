package com.xworkz.showroomapp;

import java.util.Scanner;

import com.xworkz.showroomapp.manager.Manager;
import com.xworkz.showroomapp.showroom.KtmShowRoom;
import com.xworkz.showroomapp.showroom.ShowRoom;

public class KtmShowRoomTester {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size= sc.nextInt();
		ShowRoom show= new KtmShowRoom(size);
		
		
		for(int i=0; i<size; i++) {
			
		Manager man= new Manager();
		
		System.out.println("Enter Manager Id");
		man.setManagerId(sc.nextInt());
		
		System.out.println("Enter Manager Name");
		man.setManagerName(sc.next());
			
		System.out.println("Enter Manager Address");
		man.setAddress(sc.next());
		
		System.out.println("Enter Manager Qualification");
		man.setQualification(sc.next());
		
		System.out.println("Enter Manager Contact No");
		man.setContactNo(sc.nextLong());
		
		System.out.println("Enter Manager Gender");
		man.setGender(sc.next());
		
		
		show.saveManager(man);
		
		}
		
		
		
	}
	
	
	

	}
