package com.xworkz.exceptionapp.task1;

import java.util.Scanner;


public class CreateNewFileTester {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main method Started");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		CreateNewFile crt= new CreateNewFile(size);
		
		for(int i=0; i<size; i++) {
			
			
			System.out.println("Enter File  Name To be Created");
			crt.creatFile(sc.next());
			System.out.println("file Cereated");
		}
		
		System.out.println("Main method ended");
	}
	

}
