package com.xworkz.encapsulationconcept.termina1;

import java.util.Scanner;


public class Termina1Tester {

	
	public static void main (String[] args) {
		
		Terminal1 tm= new Terminal1();
		
		Scanner sc=  new Scanner(System.in);
		
		System.out.println("Enter Terminal Name");
		tm.setName(sc.next());
		
		System.out.println("Enter Terminal No");
		tm.setTerminalNo(sc.nextInt());
		
		System.out.println("Emter Terminal Type");
		tm.setTerminalType(sc.next());
		
		System.out.println(tm.getName()+" "+ tm.getTerminalNo()+" "+ tm.getTerminalType());
		
		
	}
	
	
}
