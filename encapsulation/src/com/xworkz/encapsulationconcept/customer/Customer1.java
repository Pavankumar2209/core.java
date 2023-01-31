package com.xworkz.encapsulationconcept.customer;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Customer1 {
	
	public Customer1() {
		
	}
	
	private String customerName;
	private int customerId;
	private String branch;
	private String city;
	
	
	public Customer1(String customerName, int customerId, String Branch, String city ) {
		
		this.customerName= customerName;
		this.customerId= customerId;
		this.branch =  Branch;
		this.city = city;
		
		
	}
	
	
	/*
	public void setCustomerName(String name) {
		
		this.customerName = name;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
		
	}
	public String getBranch() {
		return branch;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}*/
}
