package com.xworkz.bankapp;

import java.util.Scanner;

import com.xworkz.bankapp.bank.Bank;
import com.xworkz.bankapp.bank.HdfcBank;
import com.xworkz.bankapp.customer.Customer;

public class HdfcBankTester {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size= sc.nextInt();
		
		Bank bank= new HdfcBank(size);
		
		for(int index=0; index<size; index++) {
			
			Customer cust = new Customer();
			
		System.out.println("Enter Customer Id");
		cust.setCustomerId(sc.nextInt());
		
		System.out.println("Enter Customer Name");
		cust.setCustomerName(sc.next());
		
		System.out.println("Enter Branch");
		cust.setBranch(sc.next());
		
		System.out.println("Enter City name");
		cust.setCity(sc.next());
		
		bank.saveCustomer(cust);
		
			
			
		}
	
		//bank.getCustomer();    upto here opps concept 
		
		//from here fetching methods by switch concept
		
		System.out.println("Enter a to get customer details");
		System.out.println("Enter b to get customer by customer id");
		System.out.println("Enter c to get customer by name ");
		System.out.println("Enter d to get customer by city");
		System.out.println("Enter e to update Customer name By Customer Id");
		
		
		String option = sc.next();
		switch(option) {
		
		case "a": bank.getCustomer();
				break;
				
				
		case "b" :System.out.println("Enter Customer Id");
					int id= sc.nextInt();
					bank.getCustomerBycustomerId(id);
					break;
					
		case "c" : System.out.println("Enter Customer name");
					String name= sc.next();
					bank.getCustomerByName(name);
					
		case "d": System.out.println("Enter city");
					String city= sc.next();
					bank.getCustomerByCity(city);
					break;
					
		case "e" : System.out.println("Enter newName");
					String newname= sc.next();
					System.out.println("Enter Customer Id");
					int cid= sc.nextInt();
					bank.updateCustomerNameById(newname, cid);
					break;
					
		
		
		}
		
	}
}
