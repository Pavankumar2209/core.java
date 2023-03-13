package com.xworkz.collectionsapp.tasks;

import java.util.ArrayList;
import java.util.Collection;

public class Task2_Int {
	
	public static void main(String args[]) {
		
		Collection list = new ArrayList();
		
		System.out.println();
		
		System.out.println("Indian Cricket players jersey No");
		
		list.add(18);
		list.add(07);
		list.add(1);
		list.add(45);
		list.add(8);
		list.add(33);
		list.add(12);
		list.add(10);
		list.add(3);
		list.add(99);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("Size of the collection before using remove method : "+list.size());
		System.out.println(list.remove(10));
		System.out.println("Size of the collection after using remove method : "+list.size());
		System.out.println(list);
		System.out.println(list.equals(48));
		System.out.println(list.contains(18));
		
	}
}
