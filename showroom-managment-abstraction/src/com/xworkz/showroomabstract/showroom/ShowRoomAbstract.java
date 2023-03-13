package com.xworkz.showroomabstract.showroom;

import com.xworkz.showroomabstract.exception.ManagerNotFoundException;
import com.xworkz.showroomabstract.manager.Manager;

public interface ShowRoomAbstract {

	
	public boolean saveManager(Manager manager);
	
	public void getManager();
	
	public Manager getManagerByManagerQualification(String qualification)throws ManagerNotFoundException;
	
	public Manager getManagerByManagerAddress(String address) throws ManagerNotFoundException;
	
	public Manager getManagerByContactNo(long contactNo);
	
	public Manager getManagerByManagerName(String managerName);
	
	public Manager getManagerByManagerGender(String gender);
	
	public Manager updateManagerContactNoById(long newNo,int managerId);
	
	
	
}
