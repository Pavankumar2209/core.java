package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.customer.Customer;

public class HdfcBank extends Bank {
	
	/*String kk = "Krishna";
	
	public void display() {
		System.out.println(kk);
	}*/
	
	public HdfcBank(int size) {
		
		super(size);  // super method call only inside constructor that too as a  first statement.
		System.out.println("Hdfc Bank object is created");
		
		
	}
	
	
	@Override
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
	
}
