package com.xworkz.collectionsapp.bank_managment_system.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;

public class BankImpls implements Bank {

	List<CustomerDTO>  lis = new ArrayList<CustomerDTO>();

	@Override
	public boolean addCustomer(CustomerDTO dto) {
		boolean isAdded = false ;
		
		if(dto.getCustomerName() != null && dto.getCustomerName() != "") {
			lis.add(dto);
			
			isAdded = true ;
			
		}
		System.out.println("Customer Added Sucessfully ");
		
	return isAdded ;	
	}

	
	@Override
	public List<CustomerDTO> getAllCustomer() {
		
		Iterator<CustomerDTO>  itr = lis.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		return lis;
	}
	
	/*
	 * public CustomerDTO getCustomerBycustomerId(int id) {
	 * System.out.println("getting customer by customer id method started");
	 * 
	 * for(int i=0; i<CustomerDTO.length; i++) {
	 * if(customer[i].getCustomerId()==id){
	 * 
	 * System.out.println(" id:"+" "+customer[i].getCustomerId() );
	 * System.out.println("Customer Id is Matching proced with");
	 * System.out.println(customer[i].getCustomerName()+" "+
	 * customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+
	 * customer[i].getCity()); return customer[i]; } }
	 * System.out.println("getting customer by customer id method Ended");
	 * 
	 * return null; }
	 * 
	 * 
	 * public Customer getCustomerByName(String name) {
	 * System.out.println("getting customer by customer Name method started");
	 * 
	 * for(int i=0; i<customer.length; i++) {
	 * if(customer[i].getCustomerName().equals(name)) {
	 * System.out.println("Customer name:"+" "+customer[i].getCustomerName());
	 * System.out.println("String name is Matched proced with.....");
	 * System.out.println(customer[i].getCustomerName()+" "+
	 * customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+
	 * customer[i].getCity()); return customer[i]; } }
	 * System.out.println("getting customer by customer Name method ended");
	 * 
	 * return null; }
	 * 
	 * 
	 * 
	 * public Customer getCustomerByCity(String cityName) {
	 * System.out.println("getting customer by city method started");
	 * 
	 * for(int i=0;i<customer.length; i++) {
	 * 
	 * if(customer[i].getCity().equals(cityName)) {
	 * System.out.println("customer city:"+" "+customer[i].getCity());
	 * System.out.println("The string cityName is  matched proced with....");
	 * System.out.println(customer[i].getCustomerName()+" "+
	 * customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+
	 * customer[i].getCity()); return customer[i]; } }
	 * System.out.println("getting customer by city method ended");
	 * 
	 * return null; }
	 * 
	 * 
	 * public Customer updateCustomerNameById(String newName, int id){
	 * System.out.println("Updating customer name by id method started");
	 * 
	 * for(int i=0; i<customer.length; i++) { if(customer[i].getCustomerId()==id) {
	 * System.out.println("Customer Id:"+" "+customer[i].getCustomerId() );
	 * System.out.println("Customer id is Matched Proced with....");
	 * System.out.println("Customer current Name is:"+" "+customer[i].
	 * getCustomerName()); customer[i].setCustomerName(newName);
	 * System.out.println("Customer name Updated "+" "+
	 * customer[i].getCustomerName());
	 * System.out.println(customer[i].getCustomerName()+" "+
	 * customer[i].getCustomerId()+" "+ customer[i].getBranch()+" "+
	 * customer[i].getCity()); return customer[i];
	 * 
	 * } } System.out.println("Updating customer name by id method Ended"); return
	 * null; }
	 * 
	 * 
	 */
	
  }
	
 
