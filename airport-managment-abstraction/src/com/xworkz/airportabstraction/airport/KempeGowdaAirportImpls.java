package com.xworkz.airportabstraction.airport;

import com.xworkz.airportabstraction.terminal.Terminal;

public class KempeGowdaAirportImpls implements Airport_Abstraction{
	
	Terminal terminal[];
	int index;
	
	 public KempeGowdaAirportImpls(int size) {
		
		terminal = new  Terminal[size];
	}

	@Override
	public boolean addTerminal(Terminal terminal) {
		boolean isAdded = false;
		System.out.println("Inside add method");
		
		if(terminal.getName() != null && terminal.getName() != "") {
			this.terminal[index++]= terminal;
			System.out.println("Terminal is Sucessfully added to the airpot");
			isAdded = true;
			
		}else {System.out.println("Terminal name can not be null or empty");
		}
		return isAdded;
	}

	@Override
	public void getAllTerminals() {
		for (int i=0; i<terminal.length; i++) {
			
			//System.out.println(terminal[i].getName()+" "+ terminal[i].getName()+ " "+ terminal[i].getTerminalType());
			System.out.println(terminal[i]);
		}
	}

	@Override
	public Terminal getTerminalByName(String name) {
		System.out.println("Get TerminalBy name");
		
		for(int i=0; i<terminal.length; i++) {
			if (terminal[i].getName().equals(name)) {
				System.out.println("Terminal name is matching....Proceding with");
				//System.out.println(terminal[i].getName()+" "+ terminal[i].getTerminalNo()+ " "+ terminal[i].getTerminalType());
				System.out.println(terminal[i]);
				return terminal[i];
			}
		}
		System.out.println("end of the Get Terminal by name method eded");
		return null;
	}

	@Override
	public Terminal getTerminalByTerminalNo(int terminalNo) {
		System.out.println("Get terminal by terminal no method started");
		
		for(int i=0; i<terminal.length; i++) {
			if(terminal[i].getTerminalNo()==terminalNo) {
				System.out.println("Terminal No is matching.....Proced with");
				//System.out.println(terminal[i].getName()+" "+ terminal[i].getTerminalNo()+ " "+ terminal[i].getTerminalType());
				System.out.println(terminal[i]);
				return terminal[i];
				
			}
		}
		System.out.println("get terminal by terminal No method is ended");
		return null;
		
	}
}
