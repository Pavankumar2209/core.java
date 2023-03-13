package com.xworkz.collectionsapp.concept_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Concept_Set {
	
	public static void main(String[] args) {
		
		
		Object PRESENT = new Object();
		Object obj = null;
		System.out.println(PRESENT == null);   // New objectas values can not be null.    
		
		
		//Set set = new HashSet(); // Hashset does not give output in ordered  way.
		
		//Set set = new LinkedHashSet();    // LinkedHashset gives ouput in ordered way.
		
		Set set = new TreeSet();   // if we want to sort the data we go with TreeSet   // it will sort only string or only integers 
		
									//  if we sorted both integer and string values it will throw class cast exception.
		
		
		
		//set does not allow duplicate values
		
		set.add("Mahesh");
		set.add("Vikas");
		//set.add(25);         // if we sorted both integer and string values it will throw class cast exception.
		set.add("Vaibhav");
		set.add("Satish");
		set.add("Shiva");
		set.add("Vikas");
		set.add("Vaibhav");
		set.add("Akshay");
		//set.add(null);       // can not use null values in TreeSet 
		
		
		
		System.out.println(set);
		System.out.println(set.size());
		
		
		
		System.out.println("Fetching the data by using for each ");
		for(Object object:set) {
			System.out.println(object);
		}
		
		
		//iterator method used to retrive the data , iterator is available is Iterator intetface , its a abstract method.
		System.out.println("Fetching the data by using Iterator ");
		
		//Iterator is method       //iterator() is a method
		Iterator itr = set.iterator();
		
		//hasNext method : it will check whether data is available or not , return type is boolean , if true enter into the while loop.
		//hasNext method dont retun values.
		while(itr.hasNext()) {
			
			//next method used to fetch the values or data . return object that is added/
			Object ob = itr.next();
			//String ob = (String)itr.next();
			System.out.println(ob);
		}
		
	}
	
	

}
