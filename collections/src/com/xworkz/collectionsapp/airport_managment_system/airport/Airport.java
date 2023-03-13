package com.xworkz.collectionsapp.airport_managment_system.airport;

import java.util.List;

import com.xworkz.collectionsapp.airport_managment_system.dto.TerminalDTO;

public interface Airport   {
	
	
	//Abstract methods
	public boolean addTerminal(TerminalDTO terminal)throws Exception;
		
	 
	
	List<TerminalDTO> getAllTerminals() ;
	
	
	//List<TerminalDTO> getTerminalByName(String name);
	
	
	//List <TerminalDTO> getTerminalByTerminalNo(int terminalNo) ;

}
