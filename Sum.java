class Sum{

	//method without return type , we use void 
	// for method with return type,  we  dont use void, insted of that we use return at the end of main method (just before curly brasses. 
	
	
//without return method:=================================
	//public static void main(String sum[]){
	// invoking method or calling the method 
	// arguments are 1000, 2000
	//	int total = add(1000,2000);
	//	add(3000,4000);
	//	add(5000,6000);
	//	add(7000,8000);
	//	add(9000,10000);
	
		
	//}
		//method
	//	public static void add(int number1 , int number2){
	//		return number1+number2
		
	//}
	//}


//with return method :=======================================
	
	public static void main(String sum[]){
		
		int total = add(1000,2000);
		System.out.println(total);
		
		int total1= add(3000,4000);
		System.out.println(total1);
		
		int total2 = add(5000,6000);
		System.out.println(total2);
		
		int total3 = add(7000,8000);
		System.out.println(total3);
		
		int total4= add(9000,10000);
		System.out.println(total4);
	
		
		}
			//method
			public static int add(int number1 , int number2){
			return number1+number2;
		
	}
}