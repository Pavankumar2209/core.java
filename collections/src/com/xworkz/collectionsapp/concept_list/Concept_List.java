package com.xworkz.collectionsapp.concept_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Concept_List {

	public static void main(String[] args) {
		
		
		//storing different types of data in single array by using object Array
		Object obj[] = {25, "krishna", 365, "Mahesh"};
		
		for(Object object:obj) {
			System.out.println(object);
			
		}
		
	System.out.println("=============================================================");
		
		Collection list =  new ArrayList();   // creating object of impelemented class ArrayList(class in java).
		
		list.add("Kishor");
		list.add("patil");
		list.add(25);
		list.add(36.5); 
		list.add("Manoj");
		list.add("Bharath");
		
		
		System.out.println(list.contains("patil"));
		System.out.println(list.size());
		System.out.println("Before using remove method"+ list.size());
		System.out.println(list);
		System.out.println(list.remove(36.5));
		System.out.println("Before using remove method"+ list.size());
		System.out.println(list);
		System.out.println(list.equals("Manoj"));  // herw we get false bcz . equals method in collection compare two different collections
		System.out.println(list.isEmpty());  // check whether collection is empty or not.
		
		
	}
	
}
