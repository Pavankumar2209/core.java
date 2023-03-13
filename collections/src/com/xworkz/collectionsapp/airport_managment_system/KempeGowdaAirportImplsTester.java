package com.xworkz.collectionsapp.airport_managment_system;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.xworkz.collectionsapp.airport_managment_system.airport.*;
import com.xworkz.collectionsapp.airport_managment_system.airport.KempeGowdaAirportImpls;
import com.xworkz.collectionsapp.airport_managment_system.comparator.NameComparator;
import com.xworkz.collectionsapp.airport_managment_system.comparator.TerminalTypeComparator;
import com.xworkz.collectionsapp.airport_managment_system.dto.*;

public class KempeGowdaAirportImplsTester {
	
	public static void main(String args[]) {

		Airport air = new KempeGowdaAirportImpls();
		
		List<TerminalDTO>  airlist = air.getAllTerminals();
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			
			TerminalDTO terminal = new TerminalDTO();	
		
			System.out.println("Enter Terminal Name");
			terminal.setName(sc.next());
		
			System.out.println("Enter Terminal No");
			terminal.setTerminalNo(sc.nextInt());
		
			System.out.println("Enter Type");
			terminal.setTerminalType(sc.next());		
		
			try {
				air.addTerminal(terminal);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
			System.out.println("Sorting based on name ");
			Collections.sort(airlist, new NameComparator());
			System.out.println(airlist);
			
			System.out.println("--------------------------------------------------------------");
			
			
			System.out.println("Sorting based on Terminal Type");
			Collections.sort(airlist, new TerminalTypeComparator());
			System.out.println(airlist);
			
					
		sc.close();
		
	}

}
