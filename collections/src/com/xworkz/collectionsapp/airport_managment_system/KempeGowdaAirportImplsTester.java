package com.xworkz.collectionsapp.airport_managment_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		
		//Scanner sc =  new Scanner(System.in);
		
		
		
		InputStreamReader ip = new InputStreamReader(System.in);
		
		BufferedReader sc = new BufferedReader(ip);
		System.out.println("Enter size");
		int size ;
		
			try {
				
				size = Integer.parseInt(sc.readLine());
				
				for (int i = 0; i < size; i++) {
				
			
			
			TerminalDTO terminal = new TerminalDTO();	
		
			System.out.println("Enter Terminal Name");
			terminal.setName(sc.readLine());
		
			System.out.println("Enter Terminal No");
			terminal.setTerminalNo(Integer.parseInt(sc.readLine()));
		
			System.out.println("Enter Type");
			terminal.setTerminalType(sc.readLine());		
		
			
				air.addTerminal(terminal);
				
			} 
		
			System.out.println("Sorting based on name ");
			Collections.sort(airlist, new NameComparator());
			System.out.println(airlist);
			
			System.out.println("--------------------------------------------------------------");
			
			
			System.out.println("Sorting based on Terminal Type");
			Collections.sort(airlist, new TerminalTypeComparator());
			System.out.println(airlist);
			
					
		sc.close();

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}

}
