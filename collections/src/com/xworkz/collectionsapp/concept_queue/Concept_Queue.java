package com.xworkz.collectionsapp.concept_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Concept_Queue {
	
	public static void main(String[] args) {
		
		
		Queue  data = new PriorityQueue();
		

		data.add("Mahesh");
		data.add("Vikas");
		//data.add(25);         // if we use integer values it will throw class cast exception.
		data.add("Vaibhav");
		data.add("Satish");
		data.add("Shiva");
		data.add("Vikas");
		data.add("Vaibhav");
		data.add("Akshay");
		//data.add(null);       // can not use null values in Queue , if use get null pointer exception
		
		//System.out.println(data);
		
		Iterator itr = data.iterator();
		
		while(itr.hasNext()) {
			
			Object obj = itr.next();
			System.out.println(obj);
			
			itr.remove();
			//System.out.println(data);
			
		}
		
		//data.removeAll(data);
		System.out.println(data);
	}
	

}
