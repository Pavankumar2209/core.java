package com.xworkz.airpotapp.airpot;

import java.util.Scanner;

import com.xworkz.airpotapp.terminal.Terminal;

public class KempeGowdaInternationalAirpotTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		
		
		
		Airpot air= new KempeGowdaInternationalAirpot(size);   //Polymorphism, in this line  achieving RunTime Polymorphism
		
		
		for (int i = 0; i < size; i++) {
			
			Terminal term = new Terminal();
			
			System.out.println("Enter Terminal Name");
			term.setName(sc.next());
			
			System.out.println("Enter Terminal No");
			term.setTerminaNo(sc.nextInt());
			
			System.out.println("Enter Terminal Type");
			term.setTerminalType(sc.next());
			
			air.addTerminal(term);
			
		}
		
		air.getAllTerminals();
		
		
	}
	

}
