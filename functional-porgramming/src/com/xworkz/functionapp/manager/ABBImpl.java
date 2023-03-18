package com.xworkz.functionapp.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ABBImpl implements Company{

	List<ManagerDTO>  list = new ArrayList<ManagerDTO>();	
	
	@Override
	public boolean addManager(ManagerDTO dto) {
		System.out.println(" Add Manager Method Started");
		 boolean isAdded = false ;
		 if(dto.getName()!= null & dto.getName()!= "") { 
			list.add(dto);
			isAdded = true;
			System.out.println("manager added Sucessfully");
		 }
		 
		 System.out.println("Add Manager Method Ended");
		return isAdded;
	}

	@Override
	public List<ManagerDTO> getAllManager() {
		
		System.out.println("Getting All Manager Data's");
		Iterator<ManagerDTO> itr = list.iterator();
		while(itr.hasNext()) {
			
			 System.out.println(itr.next());
			
		}
		
		return list;
	}
	
	
	

}
