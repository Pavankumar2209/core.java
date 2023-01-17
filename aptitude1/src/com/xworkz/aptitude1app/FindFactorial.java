package com.xworkz.aptitude1app;

import java.util.Scanner;

public class FindFactorial {

		FindFactorial fc= new FindFactorial();
	
	public int fact(int number) {
		int f=1;
		for(int i=1; i<=number;i++) {
			f = f*i;
			
		}
		return f;
	}
	
	
}
