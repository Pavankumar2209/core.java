package com.xworkz.abstractapp;

import com.xworkz.abstractapp.ac.Ac;
import com.xworkz.abstractapp.ac.AcInOffMode;
import com.xworkz.abstractapp.ac.AcInOnMode;
import com.xworkz.abstractapp.switches.Switch;

public class AcTester {
	
	public static void main(String[] args) {
		
		AcInOnMode sw = new AcInOffMode();
		
		sw.onOff();
		sw.on();
		sw.off();
		sw.help();
		
	}

}
