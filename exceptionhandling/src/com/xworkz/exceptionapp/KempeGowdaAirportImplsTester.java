package com.xworkz.exceptionapp;

import java.util.Scanner;

import com.xworkz.exceptionapp.airport.Airport_Abstraction;
import com.xworkz.exceptionapp.airport.KempeGowdaAirportImpls;
import com.xworkz.exceptionapp.exception.TerminalNotFoundException;
import com.xworkz.exceptionapp.terminal.Terminal;

import lombok.experimental.SuperBuilder;



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
			
			try {
				airpot.getTerminalByName("KalaburagiAirport");
				airpot.getTerminalByTerminalNo(3);
			} catch (TerminalNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				
				if(sc !=null) {
					sc.close();
					
				}
					
			}
					
		System.out.println("Main Method ended");
		
	}

}
