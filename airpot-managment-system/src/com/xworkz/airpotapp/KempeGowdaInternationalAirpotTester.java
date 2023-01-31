package com.xworkz.airpotapp;

import java.util.Scanner;

import com.xworkz.airpotapp.airpot.Airpot;
import com.xworkz.airpotapp.airpot.KempeGowdaInternationalAirpot;
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
		
		//air.getAllTerminals();
		
		System.out.println("Enter 1 to get all Terminal");
		System.out.println("Enter 2  to getTerminla by name");
		System.out.println("Enter 3 to get terminal by No");
		
		
		int option = sc.nextInt();
					 
		
		switch(option) {
		
		case 1:air.getAllTerminals();;
		break;
		
		
	
		case 2:System.out.println("Enter Terminal Name ");
		    	String name= sc.next();
		    	air.getTerminalByName(name);
		    	break;
		
		
		
		case 3: System.out.println("Enter Terminal No");
				int No = sc.nextInt();
				air.getTerminalByTerminalNo(No);
				break;
			
			
		
		}
		
		
		
	}
	

}
