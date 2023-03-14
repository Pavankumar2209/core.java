package com.xworkz.functionapp.stream;

import java.util.ArrayList;
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
		
	}

}
