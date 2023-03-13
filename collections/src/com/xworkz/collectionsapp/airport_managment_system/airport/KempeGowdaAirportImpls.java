package com.xworkz.collectionsapp.airport_managment_system.airport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collectionsapp.airport_managment_system.dto.TerminalDTO;

public class KempeGowdaAirportImpls implements Airport{
	
	List<TerminalDTO>  lis = new ArrayList<TerminalDTO>();

	@Override
	public boolean addTerminal(TerminalDTO dto)throws Exception {
		
			System.out.println("Get terminal by terminal no method started");
			boolean isAdded = false ;
			
			if(dto.getName()!= null && dto.getName()!= "") {
				
				lis.add(dto);
				isAdded = true ;
			}
			System.out.println("Terminal is added sucessfully");
		
			return isAdded;
		}
		
	

	@Override
	public List<TerminalDTO> getAllTerminals() {
		
		System.out.println("get Terminal method started");
		
		Iterator<TerminalDTO>  itr =  lis.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("get Terminal method ended");
		
		return lis;
	}

	
	
}
