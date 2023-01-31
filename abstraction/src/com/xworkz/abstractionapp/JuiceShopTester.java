package com.xworkz.abstractionapp;

import com.xworkz.abstractionapp.juiceshope.JuiceShop;
import com.xworkz.abstractionapp.juiceshope.KarnaJuiceShop;
import com.xworkz.abstractionapp.shop.Shop;

public class JuiceShopTester {
	
	public static void main(String[] args) {
		
		
		Shop shopname = new KarnaJuiceShop();
		
		shopname.doBusiness();
		shopname.toHelpNeedyPeople();
		
	}
	

}
