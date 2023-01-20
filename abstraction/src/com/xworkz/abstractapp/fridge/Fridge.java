package com.xworkz.abstractapp.fridge;

import com.xworkz.abstractapp.switches.Switch;

public class Fridge implements Switch{

	@Override
	public void onOff() {
		System.out.println("Switch is used to turn on/Off the fridge");
		
	}
	
	

}
