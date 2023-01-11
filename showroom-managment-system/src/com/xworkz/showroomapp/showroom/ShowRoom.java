package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;


public class ShowRoom extends Object {
	
					
													//CRUD OPERATION 
	
	//has a relationship
	Manager manager[];
	int index;
	
	public ShowRoom() {
		
	}
	
	public ShowRoom(int size){
		 manager = new Manager[size];
		System.out.println("The object is created");
	}
	
	
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
	
	public void getManager() {
		for(int i=0;i<manager.length;i++) {
		System.out.println(manager[i].getManagerId()+" "+manager[i].getManagerName() +" "+ manager[i].getAddress()+ " "+manager[i].getQualification()+ " "+manager[i].getContactNo()+ " "+manager[i].getGender());
		}
	}
	
	
	public Manager getManagerByManagerQualification(String qualification) {
		
		System.out.println("inside getManagerBYManagerQualification method ");
		
		for(int in=0;in<manager.length;in++) {
			if(manager[in].getQualification()==qualification) {
				System.out.println("String Qualification:"+" "+manager[in].getQualification());
				System.out.println("Qualification is Matched....proced with");
				System.out.println(manager[in].getManagerId()+" "+manager[in].getManagerName() +" "+ manager[in].getAddress()+ " "+manager[in].getQualification()+ " "+manager[in].getContactNo()+ " "+manager[in].getGender());
				return manager[in];		
			}		
		}
		return null;
	}
	
	public Manager getManagerByManagerAddress(String address) {
		for(int i1=0; i1<manager.length; i1++) {
				System.out.println("getManagerByManagerAddress Method Started");
			if(manager[i1].getAddress()==address) {
				System.out.println("String address is matched.....Proced with");
				System.out.println(manager[i1].getManagerId()+" "+manager[i1].getManagerName() +" "+ manager[i1].getAddress()+ " "+manager[i1].getQualification()+ " "+manager[i1].getContactNo()+ " "+manager[i1].getGender());
			return manager[i1];
				
			}
		}
		return null;
	}
		
	public Manager getManagerByContactNo(long contactNo) {
		for(int i2=0; i2<manager.length; i2++){
			System.out.println("getManagerByContactNo method started");
			if(manager[i2].getContactNo()==contactNo) {
			System.out.println("long contact no is Matched....Proced with");
			System.out.println(manager[i2].getManagerId()+" "+manager[i2].getManagerName() +" "+ manager[i2].getAddress()+ " "+manager[i2].getQualification()+ " "+manager[i2].getContactNo()+ " "+manager[i2].getGender());
			return manager[i2];
				
			}
		}
		return null;
	}
	
	public Manager getManagerByManagerName(String managerName) {
		for(int i3=0; i3<manager.length; i3++) {
			if(manager[i3].getManagerName()==managerName) {
				System.out.println("String ManagerName is Matched....Proced with");
				System.out.println(manager[i3].getManagerId()+" "+manager[i3].getManagerName() +" "+ manager[i3].getAddress()+ " "+manager[i3].getQualification()+ " "+manager[i3].getContactNo()+ " "+manager[i3].getGender());
				return manager[i3];
			}
		}
		return null;
	}
	
	public Manager getManagerByManagerGender(String gender) {
		for(int mgr=0; mgr< manager.length; mgr++) {
			if(manager[mgr].getGender()==gender) {
				System.out.println("String gender is matching....proced with");
				System.out.println(manager[mgr].getManagerId()+" "+manager[mgr].getManagerName() +" "+ manager[mgr].getAddress()+ " "+manager[mgr].getQualification()+ " "+manager[mgr].getContactNo()+ " "+manager[mgr].getGender());
				return manager[mgr];
			}
			
		}
		return null;
	}
	
	
	
	public Manager updateManagerContactNoById(long newNo,int managerId) {
		for(int ib=0; ib<manager.length; ib++) {
			if(manager[ib].getManagerId()==managerId) {
				System.out.println("int ManagerId is Matched....Proced with updating");
				System.out.println("Manager Current Contact No is"+manager[ib].getContactNo());
				manager[ib].setContactNo(newNo);
				System.out.println("Manager New Contact No is"+manager[ib].getContactNo());
			}
		}return null;
		
	}
	
}
