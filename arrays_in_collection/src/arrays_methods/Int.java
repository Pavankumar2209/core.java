package arrays_methods;

import java.util.Arrays;

public class Int {
	
	public static void main (String args[]) {
		
		int indiancricket[] = {18,99,8,45,03,07,10,12,33,63};
		int australiacricket[] = {31,32,49,33,47,67,56,58,64,14};
		//int australiacricket[] ={18,99,8,45,03,07,10,12,33,63};
		
		//foreach loop using to fetch the data from the array
		for(int i:indiancricket ) {
			
			System.out.println(i);
		}
		
		
		//here we are using Arrays class static methods :
		
		
		// sort method:  it gives ascending order of the given array.
			Arrays.sort(indiancricket);
			Arrays.sort(australiacricket);
		
		
		// toString method : it gives string representation of the given array.
		System.out.println("Indian cricket players jersey numbers");
		System.out.println(Arrays.toString(indiancricket));	
		
		System.out.println("Australia cricket players jersey numbers");
		System.out.println(Arrays.toString(australiacricket));
		
		// binarysearch method : it gives the index position of the key (value provideid ).
		System.out.println("Searching the index position of the jersey number 33");
		System.out.println(Arrays.binarySearch(indiancricket, 33)); 
		
		
		//equals method :  comparing the values form two arrays and its return type is boolean.
		System.out.println("by using equals method comaring the values from two different array");
		System.out.println(Arrays.equals(indiancricket, australiacricket));
		
		
		//binarysearch method: in this method it will give the index value between specified indexes.
		System.out.println("Getting the index position of the given value between specified index");
		System.out.println(Arrays.binarySearch(indiancricket, 2, 7, 18));
		
		
		System.out.println("Comparing the two arrays");
		//Arrays.compare(indiancricket, australiacricket);
		
		//copyof method : we can create the copy of existing array , 
		System.out.println("Creating the copy of array austrilia cricket ,");
		int australiacricket1[] =Arrays.copyOf(australiacricket, 8);
		System.out.println(Arrays.toString(australiacricket1));
		
		
		System.out.println("Creating the copy of cricket Australia by specifing the index range");
		int australiacricket2[] = Arrays.copyOfRange(australiacricket1, 3, 8);
		System.out.println(Arrays.toString(australiacricket2));
		
		
		
		
		
		
	}
	

}
