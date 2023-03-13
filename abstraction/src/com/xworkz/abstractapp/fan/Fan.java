package com.xworkz.abstractapp.fan;

import com.xworkz.abstractapp.switches.Switch;

public class Fan implements Switch{

	@Override
	public void onOff() {
		System.out.println("Switch is used to turn On/Off the fan");
		
	}
	

}
