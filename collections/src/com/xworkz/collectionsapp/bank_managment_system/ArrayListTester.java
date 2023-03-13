package com.xworkz.collectionsapp.bank_managment_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;



public class ArrayListTester {
	
	private String customerName;
	private int customerId;
	private String branch;
	private String city;
	
	public static void main(String[] args) {
		

		List<CustomerDTO> customer = new ArrayList<CustomerDTO>();
		
		customer.add(new CustomerDTO("Mahesh",1, "RR Nagar", "Bengaluru")); 
		customer.add(new CustomerDTO("Mahi",2, "RR Nagar", "Bengaluru")); 
		customer.add(new CustomerDTO ("Vinay", 3, "Jp Nagar", "Bengaluru"));
		
		System.out.println(customer.get(1));
		
		
		// sorting the data based on id , by tree set
		Set custom = new TreeSet<CustomerDTO>();
		
		custom.add(new CustomerDTO("Mahesh",1, "RR Nagar", "Bengaluru")); 
		custom.add(new CustomerDTO("Mahi",2, "RR Nagar", "Bengaluru")); 
		custom.add(new CustomerDTO ("Vinay", 3, "Jp Nagar", "Bengaluru"));
		
		
		
		System.out.println(custom);
		
		
	}
	

}
