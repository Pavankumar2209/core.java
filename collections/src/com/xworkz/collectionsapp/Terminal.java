package com.xworkz.collectionsapp;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Terminal implements Comparator<Terminal> {
 
	private String Name;
	private int terminalNo;
	private String terminalType;
	@Override
	public int compare(Terminal o1, Terminal o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
	
	
	

}
