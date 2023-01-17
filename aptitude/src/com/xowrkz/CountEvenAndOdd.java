package com.xowrkz;

public class CountEvenAndOdd {
	
	public static void main(String[] args) {
	
	int evencount=0, oddcount=0;
	for(int i=0; i<100; i++) {
		if(i%2==0) {
			evencount+=1; //evencount= evencount+1
		}else {
			oddcount+=1;
			
		}
	}
	System.out.println("even count:"+evencount);
	System.out.println("oddcount:"+oddcount);
	}

}
