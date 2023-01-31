package com.xworkz.bankapp;

import java.util.Scanner;

import com.xworkz.bankapp.bank.Bank;
import com.xworkz.bankapp.bank.HdfcBank;
import com.xworkz.bankapp.customer.Customer;

public class BankTester {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
			
		
		
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		Bank bank = new HdfcBank(size);
		
		
		for(int i=0; i<size; i++) {
			Customer cust = new Customer();
			
		 System.out.println("Enter customer Id");
		 cust.setCustomerId(sc.nextInt());
		 
		 System.out.println("Enter Customer Name");
		 cust.setCustomerName(sc.next());
		 
		 System.out.println("Enter  Branch");
		 cust.setBranch(sc.next());
		 
		 System.out.println("Enter city");
		 cust.setCity(sc.next());
		 
		 bank.saveCustomer(cust);
		 
		 
		
		}
		
		
		
		bank.getCustomer();
		sc.close();
		bank.getCustomerByCity("Benglore");
	
		bank.getCustomerBycustomerId(2);
		
		bank.getCustomerByName("Raj");
	
		bank.updateCustomerNameById("Rocky",3);
		
		//casting    : to achive casting we need inheritance and polymorphism concepts
		// HdfcBank ban = (HdfcBank)bank;
		//ban.display();
		
		
		
		
	}
	

}
