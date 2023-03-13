package arrays_methods;

import java.util.Arrays;

public class Char {

	public static void main(String[] args) {
		
		char alphabets[] = {'a','b','c','d','e','f'};
		char alphabets1[] = {'k','z','b','a','m','f'};
		
		System.out.println("aplhabets");
		System.out.println(Arrays.toString(alphabets));
		
		
		System.out.println("using to string method to array alphabets1  ");
		 Arrays.sort(alphabets1);
		 System.out.println(Arrays.toString(alphabets1));
		
		System.out.println(Arrays.binarySearch(alphabets1, 'm'));
		
		System.out.println(Arrays.binarySearch(alphabets, 2, 5, 'd'));
		
		//System.out.println(Arrays.compare(alphabets, alphabets1));
		
		System.out.println(Arrays.equals(alphabets, alphabets1));
		
		//System.out.println(Arrays.equals(alphabets, 2, 6, alphabets1, 1, 5));
		
		//System.out.println(Arrays.mismatch(alphabets, alphabets1));
		
		char copyalphabets1[] = Arrays.copyOf(alphabets1, 4);
		System.out.println(Arrays.toString(copyalphabets1));
	}
	
}
