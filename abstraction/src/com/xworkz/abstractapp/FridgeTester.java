package com.xworkz.abstractapp;

import com.xworkz.abstractapp.fridge.Fridge;
import com.xworkz.abstractapp.switches.Switch;

public class FridgeTester {
	
	public static void main(String[] args) {
		
		Switch sw = new Fridge();
		
		sw.onOff();
		
	}

}
