package com.xworkz.abstractionapp.institute;

import com.xworkz.abstractionapp.shop.Shop;

//implementation class
public abstract class Institute implements Shop {
	
	@Override
	public long doBusiness() {
		System.out.println("Doing institute Business");
		return 200000l;
	}

}
