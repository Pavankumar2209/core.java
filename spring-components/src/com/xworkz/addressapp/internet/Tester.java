package com.xworkz.addressapp.internet;

public class Tester {
	
	public static void main(String[] args) {
		
		Internet internet = new Internet();
		
		Browser browser = new Browser();
		browser.setBrowserName1("Google Chrome");
		browser.setBrowaerName3("Microsoft edge ");
		browser.setBrowserName2("Opera");
		
		internet.setBrowser(browser);
		
		System.out.println(internet);
		
	}

}
