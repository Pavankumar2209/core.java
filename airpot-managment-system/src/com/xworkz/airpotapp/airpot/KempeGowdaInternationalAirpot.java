package com.xworkz.airpotapp.airpot;

import com.xworkz.airpotapp.terminal.Terminal;

public class KempeGowdaInternationalAirpot extends Airpot {

			boolean isIntTerminal = true;
	
			public KempeGowdaInternationalAirpot(int size) {
		
					terminal = new Terminal[size];
		
					System.out.println("KempeGowda Airpot object is created");
			}
			
			
			@Override
			public boolean addTerminal(Terminal terminal) {
				System.out.println("Inside add Terminal method - kempegowda airpot ");
				if(isIntTerminal=true) {
					System.out.println("The Terminal is InterNational type");
					boolean isAdded = super.addTerminal(terminal);
					System.out.println("The terminal details is added");
					return isAdded;
				}
				
			return false;	
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
