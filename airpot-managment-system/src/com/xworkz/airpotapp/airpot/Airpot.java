package com.xworkz.airpotapp.airpot;

import com.xworkz.airpotapp.terminal.Terminal;

public class Airpot {
	
	Terminal terminal[];
	int index;
	
	
	
	public Airpot(int size) {
		
		System.out.println("AirPot object is created");
		terminal = new Terminal[size];
	}
	
	
	
	public boolean addTerminal(Terminal terminal) {
		boolean isAdded = false;
		System.out.println("Inside add method");
		
		if(terminal.name != null && terminal.name != "") {
			this.terminal[index++]= terminal;
			System.out.println("Terminal is Sucessfully added to the airpot");
			isAdded = true;
			
		}else {System.out.println("Terminal name can not be null or empty");
		}
		return isAdded;
			
	}
	
	
	
	
	public void getAllTerminals() {
		for (int i=0; i<terminal.length; i++) {
			System.out.println(terminal[i].name+" "+ terminal[i].terminalNo+ " "+ terminal[i].terminalType);
		}
	}
	
	
	
	
	public Terminal getTerminalByName(String name) {
		
		System.out.println("Get TerminalBy name");
		
		for(int i=0; i<terminal.length; i++) {
			if (terminal[i].name==name) {
				System.out.println("Terminal name is matching....Proceding with");
				System.out.println(terminal[i].name+" "+ terminal[i].terminalNo+ " "+ terminal[i].terminalType);
				return terminal[i];
			}
		}
		System.out.println("end of the Get Terminal by name method eded");
		return null;
		
	}
	
	
	
	
	public Terminal getTerminalByTerminalNo(int terminalNo) {
		System.out.println("Get terminal by terminal no method started");
		
		for(int i=0; i<terminal.length; i++) {
			if(terminal[i].terminalNo==terminalNo) {
				System.out.println("Terminal No is matching.....Proced with");
				System.out.println(terminal[i].name+" "+ terminal[i].terminalNo+ " "+ terminal[i].terminalType);
				return terminal[i];
				
			}
		}
		System.out.println("get terminal by terminal No method is ended");
		return null;
	}

}
