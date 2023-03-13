package arrays_methods;

import java.util.Arrays;

public class Long {

	public static void main(String[] args) {
		
		long schoolFrndsphoneNums[] = {9988776655l,8899776655l, 7788996655l,9876543210l, 8879654215l};
		long collegeFrndsPhoneNums[] = {7896543210l,89966332211l,9879879871l, 9654965422l,8528528521l};
		
		System.out.println("School friends phone numbers");
		System.out.println(Arrays.toString(schoolFrndsphoneNums));
		
		System.out.println("College friends phone numbers");
		System.out.println(Arrays.toString(collegeFrndsPhoneNums));
		
		System.out.println("Sort method used to school friends array");
		Arrays.sort(schoolFrndsphoneNums);
		System.out.println(Arrays.toString(schoolFrndsphoneNums));
		
		System.out.println("Searching index no of the 9879879871l from collegeFrndsPhoneNums ");
		System.out.println(Arrays.binarySearch(collegeFrndsPhoneNums, 9879879871l));
		
		System.out.println("Searching the index num of 8899776655l ");
		System.out.println(Arrays.binarySearch(schoolFrndsphoneNums, 1, 3, 8899776655l));
		
		//Arrays.compare(schoolFrndsphoneNums, collegeFrndsPhoneNums);
		System.out.println("Using equals method");
		System.out.println(Arrays.equals(schoolFrndsphoneNums, collegeFrndsPhoneNums));
		
		System.out.println("Creating the copy of collegefrndsNum upto index 3 ");
		long copyCollegeFrndsPhoneNums[] = Arrays.copyOf(schoolFrndsphoneNums, 3);
		System.out.println(Arrays.toString(copyCollegeFrndsPhoneNums));
		
		System.out.println("Creating the copy of schoolFrndsphoneNums specifing  index no ");
		System.out.println(Arrays.copyOfRange(schoolFrndsphoneNums, 1, 4));
	}
	
}
