package com.xworkz.collectionsapp;

import java.util.Comparator;

public class NameComparator implements Comparator<Terminal>{

	@Override
	public int compare(Terminal o1, Terminal o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}