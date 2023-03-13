package com.xworkz.abstractapp.tubelight;


import com.xworkz.abstractapp.switches.Switch;




public class TubeLight implements Switch{
	
		@Override
	public void onOff() {
			
		System.out.println("Switch is used to trun ON/OFF the light");
		}

}
