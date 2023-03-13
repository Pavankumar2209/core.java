package com.xworkz.collectionsapp.airport_managment_system.comparator;

import java.util.Comparator;

import com.xworkz.collectionsapp.airport_managment_system.dto.TerminalDTO;

public class TerminalTypeComparator implements Comparator<TerminalDTO> {

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		
		return o1.getTerminalType().compareTo(o2.getTerminalType());
	}

}
