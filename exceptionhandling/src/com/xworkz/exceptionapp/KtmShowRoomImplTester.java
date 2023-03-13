package com.xworkz.exceptionapp;

import java.util.Scanner;

import com.xworkz.exceptionapp.manager.Manager;
import com.xworkz.exceptionapp.showroom.KtmshowRoomImpl;
import com.xworkz.exceptionapp.showroom.ShowRoomAbstract;





public class KtmShowRoomImplTester {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size= sc.nextInt();
		ShowRoomAbstract show= new KtmshowRoomImpl(size);
		
		
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
