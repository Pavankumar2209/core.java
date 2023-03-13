package com.xworkz.collectionsapp.bank_managment_system;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.xworkz.collectionsapp.bank_managment_system.bank.Bank;
import com.xworkz.collectionsapp.bank_managment_system.bank.BankImpls;
import com.xworkz.collectionsapp.bank_managment_system.comparator.BranchComparator;
import com.xworkz.collectionsapp.bank_managment_system.comparator.CityComparator;
import com.xworkz.collectionsapp.bank_managment_system.comparator.NameComparator;
import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;


public class BankTester {
	
	public static void main(String[] args) {
		
		//Scanner sc =  new Scanner(System.in);
		
		
		//insted of scanner we used buffer reader class to take user inputs
		InputStreamReader inp = new InputStreamReader(System.in);  
		
		BufferedReader sc = new BufferedReader(inp); 
		
		Bank bank = new BankImpls();
		
		List<CustomerDTO>  di = bank.getAllCustomer();
		
		System.out.println("Enter the array size");
		int size;
		
		
			try {
				size = Integer.parseInt(sc.readLine());
			
			
			for(int i=0; i<size; i++) {
				CustomerDTO cust = new CustomerDTO();
				
			 System.out.println("Enter customer Id");
			 cust.setCustomerId(Integer.parseInt(sc.readLine()));
			 
			 System.out.println("Enter Customer Name");
			 cust.setCustomerName(sc.readLine());
			 
			 System.out.println("Enter  Branch");
			 cust.setBranch(sc.readLine());
			 
			 System.out.println("Enter city");
			 cust.setCity(sc.readLine());
			 
			 bank.addCustomer(cust);
			 
			}
			 bank.getAllCustomer();
				
				System.out.println("Sorting the data based on Name ");
				Collections.sort(di	, new NameComparator());
				System.out.println(di);
				
				System.out.println("Sorting data based on branch");
				Collections.sort(di, new BranchComparator());
				System.out.println(di);
				
				System.out.println("Sorting data based on City ");
				Collections.sort(di, new CityComparator());
				System.out.println(di);
				
				
				
				 	
			 sc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
		
		
		
		
		
		
		
		
	
	

}
