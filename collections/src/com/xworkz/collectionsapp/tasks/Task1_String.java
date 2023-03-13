package com.xworkz.collectionsapp.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Task1_String {

	public static void main(String[] args) {
		
		List data = new ArrayList();
		
		System.out.println("10 States in India");
		data.add("Karnataka");
		data.add("Tamilnadu");
		data.add("Andrapradesh");
		data.add("Maharastra");
		data.add("Gujrath");
		data.add("Punjab");
		data.add("MadhyaPradesh");
		data.add("WestBengal");
		data.add("Sikkim");
		data.add("Rajsthan");
		
		Iterator<Task1_String> itr = data.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
			
		}
		
		
		
		/*
		 * System.out.println(data.size()); System.out.println(data);
		 * System.out.println(data.contains("Punjab"));
		 * System.out.println(data.isEmpty());
		 * System.out.println("Size before using remove method"+data.size());
		 * System.out.println(data.remove("Tamilnadu"));
		 * System.out.println("Size after using remove method"+data.size());
		 * System.out.println(data);
		 */
		
	
		
	}
	
}




