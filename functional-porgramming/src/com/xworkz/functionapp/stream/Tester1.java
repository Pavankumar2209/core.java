package com.xworkz.functionapp.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Tester1 {
	
	public static void main(String[] args) {

		List<Integer>  lis =  new ArrayList<Integer>(); 
		
		lis.add(55);
		lis.add(75);
		lis.add(105);
		lis.add(225);
		lis.add(65);
		lis.add(165);
		lis.add(18);
		lis.add(24);
		lis.add(112);
		lis.add(162);
		lis.add(55);
		lis.add(126);
		lis.add(222);
		lis.add(96);
		lis.add(10);
		lis.add(110);
		lis.add(162);
		lis.add(200);
		lis.add(42);
		
		
		Iterator<Integer>  itr = lis.iterator();
		System.out.println("Datas from  the given list are ");
		while(itr.hasNext()) {
			Integer ir = itr.next();
			System.out.println(ir);
		}
		System.out.println("---------------------------------------------------------");
		
		System.out.println("datas from the given list which  are  above 100");
		List<Integer> li = lis.stream().filter(ir -> (ir >100)).collect(Collectors.toList());
		System.out.println(li);
		
		System.out.println("datas from the given list which  are  above 100");
		List<Integer> li1 = lis.stream().filter(ir -> (ir <100)).collect(Collectors.toList());
		System.out.println(li1);
		
		
		
		
		
		
		//comparing is a method, which is available in Comparator interface and we providing which type of data it is 
		//max and min are method available in optional interface
		System.out.println(lis.stream().max(Comparator.comparing(Integer::valueOf)));  //(::)method reference symbol
		System.out.println(lis.stream().min(Comparator.comparing(Integer::intValue)));
		
		
		
		//Different ways of getting the min and max values from the list other than max and min methods
		System.out.println(lis.stream().mapToInt(Integer::intValue).max());
		
		System.out.println(lis.stream().collect(Collectors.maxBy(Comparator.naturalOrder())));
		System.out.println(lis.stream().collect(Collectors.minBy(Comparator.naturalOrder())));
		
		
		
		
		//task for today is : compare string values 
		
				
				
	}

}
