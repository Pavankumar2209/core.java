package com.xworkz.collectionsapp.bank_managment_system.dto;

import java.io.Serializable;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO implements Serializable{
	
	
	
	/*public Customer() {
		//System.out.println("Default constructor is created");
	}*/
	
	private String customerName;
	private int customerId;
	private String branch;
	private String city;
	

	//overriding the compareTo method from Comparable interface
	//@Override
	/*public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.customerId - o.customerId;
	}*/
	
	
	//public getter and setter method
	
	/*public void setCustomerName(String customerName) {
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
	}*/

}
