package com.xworkz.exceptionapp.airport;

import com.xworkz.exceptionapp.exception.TerminalNotFoundException;
import com.xworkz.exceptionapp.terminal.Terminal;

public interface Airport_Abstraction {
	
	
	//Abstract methods
	public boolean addTerminal(Terminal terminal);
		
	
	public void getAllTerminals() ;
	
	
	public Terminal getTerminalByName(String name) throws TerminalNotFoundException;
	
	
	public Terminal getTerminalByTerminalNo(int terminalNo) throws TerminalNotFoundException;

}
