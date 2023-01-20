package com.xworkz.abstractapp;

import com.xworkz.abstractapp.projector.Projector;
import com.xworkz.abstractapp.switches.Switch;

public class ProjectorTester {
	
	public static void main(String[] args) {
		
		Switch sw = new Projector();
		sw.onOff();
	}

}
