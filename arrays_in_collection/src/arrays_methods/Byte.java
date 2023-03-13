package arrays_methods;

import java.util.Arrays;

public class Byte {
	
	public static void main(String[] args) {
		
		byte num[] = {22,15,26,5,48,16,4,11,52,35};
		byte slnos[] = {28,13,48,29,41,36,22,44,17,5};
		
		Arrays.sort(num);
		
		System.out.println("The given  array");
		System.out.println(Arrays.toString(slnos));
		
		System.out.println("copy of the arry upto index no 7");
		byte copyNums[] = Arrays.copyOf(num, 7);
		System.out.println(Arrays.toString(copyNums));
		
		System.out.println("copy of the arry between  index no 2 & 6");
		byte rangeCopy[]= Arrays.copyOfRange(copyNums, 2, 6);
		System.out.println(Arrays.toString(rangeCopy));
		
		//System.out.println(Arrays.binarySearch(slnos, 4));
		
		//Arrays.compare(slnos, num);
		
		//Arrays.binarySearch(num, 1);
		
		
		
	}

}
