package com.xworkz.bankapp.bank;

public class HdfcBank extends Bank {
	
	/*String kk = "Krishna";
	
	public void display() {
		System.out.println(kk);
	}*/
	
	public HdfcBank(int size) {
		
		super(size);  // super method call only inside constructor that too as a  first statement.
		System.out.println("Hdfc Bank object is created");
		
	}

}
