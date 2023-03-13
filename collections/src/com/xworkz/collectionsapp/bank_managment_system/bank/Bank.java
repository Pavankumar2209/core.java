package com.xworkz.collectionsapp.bank_managment_system.bank;

import java.util.List;

import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;

public interface Bank    {
	
	
	 abstract boolean addCustomer(CustomerDTO dto) throws Exception;
	 
	 List<CustomerDTO> getAllCustomer();

}
