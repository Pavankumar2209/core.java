package com.xworkz.exceptionapp.showroom;

import com.xworkz.exceptionapp.manager.Manager;
import com.xworkz.exceptionapp.exception.*;

public interface ShowRoomAbstract {

	
	public boolean saveManager(Manager manager);
	
	public void getManager();
	
	public Manager getManagerByManagerQualification(String qualification)throws ManagerNotFoundException;
	
	public Manager getManagerByManagerAddress(String address) throws ManagerNotFoundException;
	
	public Manager getManagerByContactNo(long contactNo) throws ManagerNotFoundException;
	
	public Manager getManagerByManagerName(String managerName) throws ManagerNotFoundException;
	
	public Manager getManagerByManagerGender(String gender) throws ManagerNotFoundException;
	
	public Manager updateManagerContactNoById(long newNo,int managerId) throws ManagerDataNotUpdatedException;
	
	
	
}
