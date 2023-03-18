package com.xworkz.functionapp.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TaskSting {
	
	public static void main(String args[]) {
		
		List<String>  list = new ArrayList<String>();
		
		InputStreamReader ip = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ip);
		
		System.out.println("Sandalwood Movie Names are");
		list.add("Kabzaa");
		list.add("KGF");
		list.add("Vikranth Rona");
		list.add("Kranti");
		list.add("Gandada Gudi");
		list.add("Kantara");
		list.add("Kirik Party");
		list.add("Mungaru male");
		list.add("Jems");
		list.add("UI");
		list.add("Vedha");
		list.add("Jogi");
		list.add("Paramathma");
		list.add("Gaalipata");
		list.add("SangolliRayanna");
		
		list.stream().forEach(data -> System.out.println(data));
		
		System.out.println("Comparing the user data with existing data in list");
		
		
		  System.out.println("Enter the Movie Name to be Search");
		  
		  
		  
			  String movie;
			try {
				movie = br.readLine();
				list.stream().filter( d -> (d.equals(movie))).forEach(op -> System.out.println("Movie is available"));
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			  
				
		  
	}
}
