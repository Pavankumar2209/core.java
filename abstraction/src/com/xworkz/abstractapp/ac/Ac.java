package com.xworkz.abstractapp.ac;

import com.xworkz.abstractapp.switches.Switch;

public abstract class Ac implements Switch{

	@Override
	public void onOff() {
	System.out.println("Switch is used to trun ON/OFF  the AC");
		
	}

}
