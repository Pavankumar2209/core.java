package com.xworkz.abstractapp.ac;

public abstract class  AcInOnMode extends Ac{
	
	//abstract String a = "krishna";  we can not creat abstract variables 

	@Override
	public void on() {
		
		System.out.println("Ac is In On mode");
		
	}
	
	public abstract void help();  // abstract methods can be created in abstract class 
	
	

	
	

}
