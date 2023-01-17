package com.xowrkz;

public class CountTheDigits {
	public static void main(String[] args) {
		
		int number =1234;
		int count=0;
		while(number>0){
			
			number=number/10;
			if(number%2==0) {
				System.out.println("Even number"+number);
			}
			
			
			System.out.println(number);
			
			count++;
		}
		System.out.println("the count of the number is:"+count);
	}

}
