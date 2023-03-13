package com.xworkz.collectionsapp.tasks;

import java.util.ArrayList;
import java.util.List;

public class Concept_List {
	
	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		List list1 = new ArrayList();
		
		list.add("Hello");
		list.add("I am");
		list.add("Pavan");
		
		list1.add("Kumar");
		list1.add("From");
		list1.add("Gulbarga");
		
		System.out.println(list);
		System.out.println(list1);
		
		list.addAll(list1);
		System.out.println(list);
		
		System.out.println(list.containsAll(list1));
		System.out.println(list1.containsAll(list));
				
		
		
	}
	
	
	

}
