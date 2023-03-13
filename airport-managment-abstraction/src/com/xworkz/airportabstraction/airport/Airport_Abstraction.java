package com.xworkz.airportabstraction.airport;

import com.xworkz.airportabstraction.terminal.*;

public interface Airport_Abstraction {
	
	
	//Abstract methods
	public boolean addTerminal(Terminal terminal);
		
	
	public void getAllTerminals() ;
	
	
	public Terminal getTerminalByName(String name);
	
	
	public Terminal getTerminalByTerminalNo(int terminalNo) ;

}
