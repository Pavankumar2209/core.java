package com.xworkz.wapperclassconcept;

public class WapperClass {
	
	public static void main(String[] args) {
		
		//converting string  to wrapper  (bcz we have numbers in string value so we create wrapper class to convert string to respective datatype.
		
		String age = "50";
		
		int ag = Integer.parseInt(age);
		System.out.println(ag);
		
		long ag1 = Long.parseLong(age);
		System.out.println(ag1);
		
		boolean ag2 = Boolean.parseBoolean(age);
		System.out.println(ag2);
		
		float ag3 = Float.parseFloat(age);
		System.out.println(ag3);
		
		short ag4 = Short.parseShort(age);
		System.out.println(ag4);
		
		double ag5 = Double.parseDouble(age);
		System.out.println(ag5);
		
		byte ag6= Byte.parseByte(age);
		System.out.println(ag6);
		
		
		//wrapper
		Integer a = 60;
		System.out.println(a);
		
		
	}

}
