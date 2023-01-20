package com.xworkz.abstractapp.projector;

import com.xworkz.abstractapp.switches.Switch;

public class Projector implements Switch{

	@Override
	public void onOff() {
		System.out.println("Switche is used to trune ON/OFF the Projector");
		
	}
	
	

}
