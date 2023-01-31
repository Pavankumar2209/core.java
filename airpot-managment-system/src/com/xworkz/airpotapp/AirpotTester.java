package com.xworkz.airpotapp;

import java.util.Iterator;
import java.util.Scanner;

import com.xworkz.airpotapp.airpot.Airpot;
import com.xworkz.airpotapp.terminal.Terminal;

public class AirpotTester {

	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();		
		
		Airpot airpot = new  Airpot(size);
		
		for (int i = 0; i < size; i++) {
			
			Terminal terminal = new Terminal();	
		
			System.out.println("Enter Terminal Name");
			terminal.setName(sc.next());
		
			System.out.println("Enter Terminal No");
			terminal.setTerminaNo(sc.nextInt());
		
			System.out.println("Enter Type");
			terminal.setTerminalType(sc.next());		
		
			airpot.addTerminal(terminal);
		}
		
			airpot.getAllTerminals();
		
		
		
	}
}
