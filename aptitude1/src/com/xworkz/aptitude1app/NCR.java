package com.xworkz.aptitude1app;

import java.util.Scanner;

public class NCR {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter n and r ");
		
		int n= sc.nextInt();
		int r = sc.nextInt();
		
		int result = ncr(n)/(ncr(n-r)*ncr(r));
		System.out.println(result);
		
	}
	
	public static int ncr(int n) {
		int f=1;
		
		for(int i=n; i>=1; i--) {
			f=f*i;
		}
		return f;
	}

}
