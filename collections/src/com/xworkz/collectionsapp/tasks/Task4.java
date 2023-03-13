package com.xworkz.collectionsapp.tasks;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
	
	public static void main(String[] args) {
		
		Set dat = new HashSet();
		
		dat.add("Karnataka");
		dat.add("Tamilnadu");
		dat.add("Andrapradesh");
		dat.add("Maharastra");
		dat.add("Gujrath");
		dat.add(null); 
		
		System.out.println(dat);
		
		
		
		Set data =  new TreeSet();
		
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
		data.add(null);   //in treeset  we can not add null as a value , bcz we get null pointer exception
		
		System.out.println(data);
	}
	

}
