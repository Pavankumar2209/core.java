package com.xworkz.bankapp.customer;

public class Customer {
	
	
	public Customer() {
		System.out.println("Default constructor is created");
	}
	
	private String customerName;
	private int customerId;
	private String branch;
	private String city;
	
	
	//public getter and setter method
	
	public void setCustomerName(String customerName) {
		this.customerName= customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId= customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public String getBranch() {
		return branch;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}

}
