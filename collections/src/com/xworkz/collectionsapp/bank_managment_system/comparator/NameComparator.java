package com.xworkz.collectionsapp.bank_managment_system.comparator;

import java.util.Comparator;

import com.xworkz.collectionsapp.bank_managment_system.dto.CustomerDTO;

public class NameComparator  implements Comparator<CustomerDTO>{

	@Override
	public int compare(CustomerDTO o1, CustomerDTO o2) {
		
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

}
