package com.xworkz.abstractapp;

import com.xworkz.abstractapp.fan.Fan;
import com.xworkz.abstractapp.switches.Switch;

public class FanTester {
	
	
	public static void main(String[] args) {
		
		Switch sw = new Fan();
		
		sw.onOff();
		
	}

}
