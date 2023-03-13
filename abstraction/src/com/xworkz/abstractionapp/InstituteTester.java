package com.xworkz.abstractionapp;

import com.xworkz.abstractionapp.institute.Institute;
import com.xworkz.abstractionapp.shop.Shop;

public class InstituteTester {
	
	
	public static void main(String[] args) {
		
		
		//abstraction syntax :  intercaename reference = new ClassName();
		
		Shop shopname = new Institute();
		
		shopname.doBusiness();
		
	}
	

}
