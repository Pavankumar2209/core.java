package com.xworkz.collectionsapp.tasks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class Task3_Double {

	public static void main(String[] args) {
		
		Collection data = new ArrayList();
		Collection list = new ArrayList();
		System.out.println("Random Contact numbers");
		
		list.add(9876543210l);
		list.add(8976543211l);
		list.add(9879879871l);
		list.add(8877996655l);
		list.add(7788994455l);
		list.add(7897897891l);
		list.add(9663322111l);
		list.add(1236459879l);
		list.add(9123456789l);
		list.add(8528528521l);
		
		data.add(9876543210l);
		data.add(8976543211l);
		data.add(9879879871l);
		data.add(8877996655l);
		data.add(7788994455l);
		data.add(7897897891l);
		data.add(9663322111l);
		data.add(1236459879l);
		data.add(9123456789l);
		data.add(8528528521l);
		
		System.out.println(data.size());
		System.out.println(data);
		System.out.println(data.contains(7897897891l));
		System.out.println(data.isEmpty());
		System.out.println(data.remove(8528528521l));
		System.out.println(data.size());
		System.out.println(data);
		System.out.println("comparision between list and data collection : "+data.equals(list));
		System.out.println(data.removeAll(data));
		System.out.println(data);
		System.out.println(data.isEmpty());
		System.out.println(data);
		
		
	}
	
	
}
