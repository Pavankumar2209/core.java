package com.xworkz.functionapp.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {   				// using stream method fetch the data from the list
	
	public static void main(String[] args) {
		
		List<Integer>  lis =  new ArrayList<Integer>();
		
		lis.add(55);
		lis.add(75);
		lis.add(25);
		lis.add(98);
		lis.add(525);
		lis.add(741);
		lis.add(18);
		
		
		System.out.println("List of data using Iterator are");
		Iterator<Integer>  itr = lis.iterator();
		System.out.println("Even numbers from given list, using if condition");
		while(itr.hasNext()) {
			Integer values = itr.next();
			
			if(values % 2 == 0) {
				System.out.println(values);		
			}
		
		}
		
	    System.out.println("Even numbers from given list , by using filter method");
		List<Integer> evennumbers = lis.stream().filter(values ->(values % 2 ==0 )).collect(Collectors.toList()); System.out.println(evennumbers);
			 
		
		System.out.println("List of data using Stream");
		lis.stream().forEach(values -> System.out.println(values));
		
		
		
		
	}
	

}
