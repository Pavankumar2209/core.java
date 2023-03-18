package com.xworkz.functionapp.manager;

import java.util.List;

public interface Company {
	
	abstract boolean addManager(ManagerDTO dto)throws Exception;
	
	abstract List<ManagerDTO> getAllManager();

}
