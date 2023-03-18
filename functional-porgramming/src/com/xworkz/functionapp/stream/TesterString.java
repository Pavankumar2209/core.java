package com.xworkz.functionapp.stream;

import java.util.ArrayList;
import java.util.List;

public class TesterString {
	
	 public static void main(String[] args) {
		
		 List<String> lis = new ArrayList<String>();
		 
		 lis.add("Pavan");
		 lis.add("Asha");
		 lis.add("Satish");
		 lis.add("Mani");
		 
		 lis.stream().forEach(ab -> System.out.println(ab));
		 System.out.println("Printing the data which have its length is greater then 4");
		 lis.stream().filter(s -> (s.length()>4)).forEach(sr -> System.out.println(sr));
		 
		 
	}

}
