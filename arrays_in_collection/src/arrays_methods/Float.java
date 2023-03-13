package arrays_methods;

import java.util.Arrays;

public class Float {
	
	public static void main(String[] args) {
		
		float cost[] = {55.23f, 45.2f, 80.4f, 105.16f, 166.2f, 133.5f, 15025f};
		float amount[] = {105.26f, 55.85f, 111.05f, 10.25f, 50.56f, 41.12f, 26.12f}; 
		
		System.out.println(Arrays.toString(cost));
		System.out.println(Arrays.toString(amount));
		Arrays.sort(cost);
		
		System.out.println(Arrays.binarySearch(cost, 105.16f));
		
		System.out.println(Arrays.binarySearch(cost, 2, 4, 166.2f));
		
		float copyCost1[] =Arrays.copyOf(cost, 5);
		System.out.println(Arrays.toString(copyCost1));
		
		
		float copyCost2[] = Arrays.copyOfRange(copyCost1, 2, 5);
		System.out.println(Arrays.toString(copyCost2));
		
		//System.out.println(Arrays.compare(amount, copyCost2));
		
		System.out.println(Arrays.equals(amount, copyCost2));
		
		//System.out.println(Arrays.parallelSort(amount));
		
		
		
		
	}

}
