package com.xworkz.abstractionapp.juiceshope;

import com.xworkz.abstractionapp.shop.Shop;

//abstract class 
public abstract class JuiceShop implements Shop {

	@Override
	public long doBusiness() {
		System.out.println("doing Juice Business");
		return 25000;
	}
	
	
	

}