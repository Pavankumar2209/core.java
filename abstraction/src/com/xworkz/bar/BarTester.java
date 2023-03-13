package com.xworkz.bar;

public class BarTester {
	
	public static void main (String agrs[]) {
		
		Bar bar = new Bar(1, "Shri Venkateshwara Wines", "RajajiNagar", "Vinay");
		
		System.out.println(bar);
		
		Bar bar1 = new Bar(2, "Manjunatha wines", "VijayjNagar", "Mahesh");
		Bar bar2 = new Bar(3,"Shri Venkateshwara Wines", "Kalasipalya", "Vinod");
		Bar bar3 =  new Bar(2,"Maheshwari wines", "Jalahalli cross", "Naveen");
		Bar bar4 = new Bar(4,"Fuga wines", "Dasarahalli","Vinay");
		
		System.out.println(bar1);  // here we getting all the data by call reference only . without getter methods bcz we used toString method .
	
		System.out.println(bar.equals(bar1));
		System.out.println(bar.equals(bar2));
		System.out.println(bar2.equals(bar3));
		System.out.println(bar.equals(bar4));
		
		
		
		//hash code method is override from object class :  to get unique number of data which we want to know .
		
		System.out.println(bar.hashCode());
		System.out.println(bar1.hashCode());
		System.out.println(bar2.hashCode());
		
	}

}
