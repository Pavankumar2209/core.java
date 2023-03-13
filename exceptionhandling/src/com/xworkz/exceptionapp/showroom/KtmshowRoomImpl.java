package com.xworkz.exceptionapp.showroom;

import com.xworkz.exceptionapp.manager.Manager;

import java.nio.charset.MalformedInputException;

import com.xworkz.exceptionapp.exception.*;

public class KtmshowRoomImpl implements ShowRoomAbstract {

	Manager manager[];
	int index;
	
	public KtmshowRoomImpl(int size) {
		
		manager = new Manager[size];
		
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

	
	
	@Override
	public void getManager() {
		
		for(Manager mang: manager) {
			System.out.println(mang);
		}
		
		/*for(int i=0;i<manager.length;i++) {
			System.out.println(manager[i].getManagerId()+" "+manager[i].getManagerName() +" "+ manager[i].getAddress()+ " "+manager[i].getQualification()+ " "+manager[i].getContactNo()+ " "+manager[i].getGender());
			}*/
		
	}
	
	

	@Override
	public Manager getManagerByManagerQualification(String qualification) throws ManagerNotFoundException {
		System.out.println("inside getManagerBYManagerQualification method ");
		
		for(int in=0;in<manager.length;in++) {
			if(manager[in].getQualification().equals(qualification)) {
				System.out.println("String Qualification:"+" "+manager[in].getQualification());
				System.out.println("Qualification is Matched....proced with");
				System.out.println(manager[in].getManagerId()+" "+manager[in].getManagerName() +" "+ manager[in].getAddress()+ " "+manager[in].getQualification()+ " "+manager[in].getContactNo()+ " "+manager[in].getGender());
				return manager[in];		
			}else {
				throw new ManagerNotFoundException("No manager found with given qualification");
			}
		}
		return null;
	}

	
	
	@Override
	public Manager getManagerByManagerAddress(String address) throws ManagerNotFoundException {
		for(int i1=0; i1<manager.length; i1++) {
			System.out.println("getManagerByManagerAddress Method Started");
		if(manager[i1].getAddress().equals(address)) {
			System.out.println("String address is matched.....Proced with");
			System.out.println(manager[i1].getManagerId()+" "+manager[i1].getManagerName() +" "+ manager[i1].getAddress()+ " "+manager[i1].getQualification()+ " "+manager[i1].getContactNo()+ " "+manager[i1].getGender());
		return manager[i1];
			
		}else {
			
			throw new ManagerNotFoundException("No manager found with given address ");
		}
	}
	return null;
	}

	
	@Override
	public Manager getManagerByContactNo(long contactNo) throws ManagerNotFoundException {
		for(int i2=0; i2<manager.length; i2++){
			System.out.println("getManagerByContactNo method started");
			if(manager[i2].getContactNo()==contactNo) {
			System.out.println("long contact no is Matched....Proced with");
			System.out.println(manager[i2].getManagerId()+" "+manager[i2].getManagerName() +" "+ manager[i2].getAddress()+ " "+manager[i2].getQualification()+ " "+manager[i2].getContactNo()+ " "+manager[i2].getGender());
			return manager[i2];
				
			}else {
				throw new ManagerNotFoundException("Manager not found with the given Contact No");
				
			}
		}
		return null;
	}

	@Override
	public Manager getManagerByManagerName(String managerName) throws ManagerNotFoundException{
		for(int i3=0; i3<manager.length; i3++) {
			if(manager[i3].getManagerName().equals(managerName)) {
				System.out.println("String ManagerName is Matched....Proced with");
				System.out.println(manager[i3].getManagerId()+" "+manager[i3].getManagerName() +" "+ manager[i3].getAddress()+ " "+manager[i3].getQualification()+ " "+manager[i3].getContactNo()+ " "+manager[i3].getGender());
				return manager[i3];
			}else {
				throw new ManagerNotFoundException("Manager not found with the given Name");
			}
		}
		return null;
	}

	@Override
	public Manager getManagerByManagerGender(String gender) throws ManagerNotFoundException{
		for(int mgr=0; mgr< manager.length; mgr++) {
			if(manager[mgr].getGender().equals(gender)) {
				System.out.println("String gender is matching....proced with");
				System.out.println(manager[mgr].getManagerId()+" "+manager[mgr].getManagerName() +" "+ manager[mgr].getAddress()+ " "+manager[mgr].getQualification()+ " "+manager[mgr].getContactNo()+ " "+manager[mgr].getGender());
				return manager[mgr];
			}else {
				throw new ManagerNotFoundException("Manager not found with the given Gender");
			}
			
		}
		return null;
	}

	@Override
	public Manager updateManagerContactNoById(long newNo, int managerId) throws ManagerDataNotUpdatedException {
		for(int ib=0; ib<manager.length; ib++) {
			if(manager[ib].getManagerId()==managerId) {
				System.out.println("int ManagerId is Matched....Proced with updating");
				System.out.println("Manager Current Contact No is"+manager[ib].getContactNo());
				manager[ib].setContactNo(newNo);
				System.out.println("Manager New Contact No is"+manager[ib].getContactNo());
			}else{
				throw new ManagerDataNotUpdatedException("Given Manager ContactNo is not Updated ");
			}
		}return null;
	}

}
