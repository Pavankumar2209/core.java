package com.xworkz.collectionsapp.airport_managment_system.comparator;

import java.util.Comparator;

import com.xworkz.collectionsapp.airport_managment_system.dto.TerminalDTO;

public class NameComparator implements Comparator<TerminalDTO>{

	@Override
	public int compare(TerminalDTO o1, TerminalDTO o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
