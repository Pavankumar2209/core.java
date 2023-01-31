package com.xworkz.encapsulationconcept.customer;
import java.util.Scanner;



public class Customer1Tester {
	
	public static void main(String[] args) {
		
		Customer1 cust = new Customer1();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Customer Name");
		cust.setCustomerName(sc.next());
		
		System.out.println("Enter Customer Id");
		cust.setCustomerId(sc.nextInt());
		
		System.out.println("Enter Branch");
		cust.setBranch(sc.next());
		
		System.out.println("Enter City");
		cust.setCity(sc.next());
		
		System.out.println(cust.getCustomerName()+" "+cust.getCustomerId()+" "+cust.getBranch()+" "+cust.getCity());
		
		sc.close();
		
	}
	

}
