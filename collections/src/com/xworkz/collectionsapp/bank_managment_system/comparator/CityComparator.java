package com.xworkz.collectionsapp.bank_managment_system.comparator;

import java.util.Comparator;

import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;

public class CityComparator implements Comparator<CustomerDTO> {

	@Override
	public int compare(CustomerDTO o1, CustomerDTO o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}

}
