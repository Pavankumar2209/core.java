package com.xworkz.stringmethodspack;

public class DifferenceBetween {
	
	//difference between ==  and .equals
	/* ==  compare the string ibject references 
	 * .equals compare the value initilized for the object references.
	 */
	
	
	public static void main(String[] args) {
		
		/*String constatnt pool : in SCP the objects created using  Strign literals are stored. but
		the String objectes created using new  keyword are stored in heap memory*/
		
	
		String a ="null";
		String  b="null";
		
		
		String ab= new String("null");
		
		System.out.println(a==a);
		System.out.println(a==ab);
		System.out.println(a.equals(a));
	}
	
	

}
