package com.xworkz.collectionsapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList2   {

	public static void main(String[] args) {

		List<Terminal> data = new ArrayList<Terminal>();

		Set<Terminal> dat = new TreeSet<Terminal>();

		data.add(new Terminal("KGA", 1, "InterNational"));
		data.add(new Terminal("Gulbarga AirPort", 2, "Domestic"));
		data.add(new Terminal("Rajiv Gandhi ", 3, "Internationa"));
		data.add(new Terminal("Belgum AirPort", 4, "Domestic"));
		data.add(new Terminal("Bidar Airport", 5, "Domestic"));

		dat.add(new Terminal("KGA", 1, "InterNational"));
		dat.add(new Terminal("Gulbarga AirPort", 2, "Domestic"));
		dat.add(new Terminal("Rajiv Gandhi ", 3, "Internationa"));
		dat.add(new Terminal("Belgum AirPort", 4, "Domestic"));
		dat.add(new Terminal("Bidar Airport", 5, "Domestic"));
		// System.out.println(dat);
		
		Collections.sort(data, new NameComparator()); 
		
		  Iterator<Terminal> itr = dat.iterator(); 
		  while(itr.hasNext()) {
		  
		  Terminal te = itr.next(); System.out.println(te); 
		  }
		 

	}

}
