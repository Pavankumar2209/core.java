package com.xworkz.showroomapp.showroom;

import com.xworkz.showroomapp.manager.Manager;


public class ShowRoom {
	
					
													//CRUD OPERATION CONCEPT
	
	Manager manager[];
	int index;
	
	public ShowRoom(int size){
		 manager = new Manager[size];
		System.out.println("The object is created");
	}
	
	
	public boolean saveManager(Manager manager) {
		boolean isSaved=false;
		System.out.println("Inside save method");
		
		if(manager.managerName!= null && !manager.managerName.isEmpty()) {
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
		System.out.println(manager[i].managerId+" "+manager[i].managerName +" "+ manager[i].address+ " "+manager[i].qualification+ " "+manager[i].contactNo+ " "+manager[i].gender);
		}
	}
	
	
	public Manager getManagerByManagerQualification(String qualification) {
		
		System.out.println("inside getManagerBYManagerQualification method ");
		
		for(int in=0;in<manager.length;in++) {
			if(manager[in].qualification==qualification) {
				System.out.println("String Qualification:"+" "+manager[in].qualification);
				System.out.println("Qualification is Matched....proced with");
				System.out.println(manager[in].managerId+" "+manager[in].managerName +" "+ manager[in].address+ " "+manager[in].qualification+ " "+manager[in].contactNo+ " "+manager[in].gender);
				return manager[in];		
			}		
		}
		return null;
	}
	
	public Manager getManagerByManagerAddress(String address) {
		for(int i1=0; i1<manager.length; i1++) {
				System.out.println("getManagerByManagerAddress Method Started");
			if(manager[i1].address==address) {
				System.out.println("String address is matched.....Proced with");
				System.out.println(manager[i1].managerId+" "+manager[i1].managerName +" "+ manager[i1].address+ " "+manager[i1].qualification+ " "+manager[i1].contactNo+ " "+manager[i1].gender);
			return manager[i1];
				
			}
		}
		return null;
	}
		
	public Manager getManagerByContactNo(long contactNo) {
		for(int i2=0; i2<manager.length; i2++){
			System.out.println("getManagerByContactNo method started");
			if(manager[i2].contactNo==contactNo) {
			System.out.println("long contact no is Matched....Proced with");
			System.out.println(manager[i2].managerId+" "+manager[i2].managerName +" "+ manager[i2].address+ " "+manager[i2].qualification+ " "+manager[i2].contactNo+ " "+manager[i2].gender);
			return manager[i2];
				
			}
		}
		return null;
	}
	
	public Manager getManagerByManagerName(String managerName) {
		for(int i3=0; i3<manager.length; i3++) {
			if(manager[i3].managerName==managerName) {
				System.out.println("String ManagerName is Matched....Proced with");
				System.out.println(manager[i3].managerId+" "+manager[i3].managerName +" "+ manager[i3].address+ " "+manager[i3].qualification+ " "+manager[i3].contactNo+ " "+manager[i3].gender);
				return manager[i3];
			}
		}
		return null;
	}
	
	public Manager getManagerByManagerGender(String gender) {
		for(int mgr=0; mgr< manager.length; mgr++) {
			if(manager[mgr].gender==gender) {
				System.out.println("String gender is matching....proced with");
				System.out.println(manager[mgr].managerId+" "+manager[mgr].managerName +" "+ manager[mgr].address+ " "+manager[mgr].qualification+ " "+manager[mgr].contactNo+ " "+manager[mgr].gender);
				return manager[mgr];
			}
			
		}
		return null;
	}
	
	
	
	public Manager updateManagerContactNoById(long newNo,int managerId) {
		for(int ib=0; ib<manager.length; ib++) {
			if(manager[ib].managerId==managerId) {
				System.out.println("int ManagerId is Matched....Proced with updating");
				System.out.println("Manager Current Contact No is"+manager[ib].contactNo);
				manager[ib].contactNo=newNo;
				System.out.println("Manager New Contact No is"+manager[ib].contactNo);
			}
		}return null;
		
	}
	
}
