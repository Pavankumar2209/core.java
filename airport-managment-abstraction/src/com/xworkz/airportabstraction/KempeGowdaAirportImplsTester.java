package com.xworkz.airportabstraction;


import java.util.Scanner;

import com.xworkz.airportabstraction.airport.Airport_Abstraction;
import com.xworkz.airportabstraction.airport.KempeGowdaAirportImpls;
import com.xworkz.airportabstraction.terminal.Terminal;




public class KempeGowdaAirportImplsTester {
	
	public static void main(String args[]) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();		
		
		Airport_Abstraction airpot = new  KempeGowdaAirportImpls(size);
		
		for (int i = 0; i < size; i++) {
			
			Terminal terminal = new Terminal();	
		
			System.out.println("Enter Terminal Name");
			terminal.setName(sc.next());
		
			System.out.println("Enter Terminal No");
			terminal.setTerminalNo(sc.nextInt());
		
			System.out.println("Enter Type");
			terminal.setTerminalType(sc.next());		
		
			airpot.addTerminal(terminal);
		}
		
		
			airpot.getAllTerminals();
					
		
		
	}

}
