package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;

public class KtmShowRoom extends ShowRoom {

	public KtmShowRoom(int size){
		
		 manager = new Manager[size];
		System.out.println("The object is created");
	}
	
	@Override
	public boolean saveManager(Manager manager) {
		boolean isSaved=false;
		System.out.println("Inside save method");
		
		if(manager.getManagerName()!= null && !manager.getManagerName().isEmpty()) {
			this.manager[index++]=manager;
			System.out.println("Manager details is saved");
			isSaved=true;
		}else {
			System.out.println("Patient can not be null");
		}
		
		
		return isSaved;
	}
	
}
