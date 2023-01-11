package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.customer.Customer;

public class Bank {

	
	Customer customer[];
	int index;
	//String kk=" krishna k";
	
	public Bank() {
		//default constructor is created
	}
	
	
	public Bank(int size) {
		System.out.println("Bank Object is created");
		customer = new Customer[size];
	}
	
	
	public boolean saveCustomer(Customer customer) {
		
		boolean isSaved =false;
		
		if(customer.getCustomerName()!= null && customer.getCustomerName() != "") {
			this.customer[index++]= customer;
			System.out.println("Customer is sucessfully added");
			 isSaved =true;
		}
		else {System.out.println("Customer name can not be null or empty");
		}
		return isSaved;
	}
	
		public void getCustomer() {
			for(int i=0; i<customer.length; i++) {
				System.out.println(customer[i].getCustomerName()+" "+ customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+ customer[i].getCity());
			}
		
		}

	public Customer getCustomerBycustomerId(int id) {
		System.out.println("getting customer by customer id method started");
		
		for(int i=0; i<customer.length; i++) {
			if(customer[i].getCustomerId()==id){
				
				System.out.println(" id:"+" "+customer[i].getCustomerId() );
				System.out.println("Customer Id is Matching proced with");
				System.out.println(customer[i].getCustomerName()+" "+ customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+ customer[i].getCity());
				return customer[i];		
			}
		}
		System.out.println("getting customer by customer id method Ended");
		
	return null;
	}
	
	
	public Customer getCustomerByName(String name) {
		System.out.println("getting customer by customer Name method started");
		
		for(int i=0; i<customer.length; i++) {
			if(customer[i].getCustomerName().equals(name)) {
				System.out.println("Customer name:"+" "+customer[i].getCustomerName());
				System.out.println("String name is Matched proced with.....");
				System.out.println(customer[i].getCustomerName()+" "+ customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+ customer[i].getCity());
				return customer[i];	
			}
		}
		System.out.println("getting customer by customer Name method ended");
		
	return null;
	}
	
	
	
	public Customer getCustomerByCity(String cityName) {
		System.out.println("getting customer by city method started");
		
		for(int i=0;i<customer.length; i++) {
			
			if(customer[i].getCity().equals(cityName)) {
				System.out.println("customer city:"+" "+customer[i].getCity());
				System.out.println("The string cityName is  matched proced with....");
				System.out.println(customer[i].getCustomerName()+" "+ customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+ customer[i].getCity());
				return customer[i];	
			}
		}
		System.out.println("getting customer by city method ended");
		
	return null;
	}
	
	
	public Customer updateCustomerNameById(String newName, int id){
		System.out.println("Updating customer name by id method started");
		
		for(int i=0; i<customer.length; i++) {
			if(customer[i].getCustomerId()==id) {
				System.out.println("Customer Id:"+" "+customer[i].getCustomerId() );
				System.out.println("Customer id is Matched Proced with....");
				customer[i].setCustomerName(newName);
				System.out.println("Customer Updated as a"+" "+ customer[i].getCustomerName());
				System.out.println(customer[i].getCustomerName()+" "+ customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+ customer[i].getCity());
				return customer[i];
				
			}
		}
		System.out.println("Updating customer name by id method Ended");
	return null;
	}
	
	
  }
	
 
