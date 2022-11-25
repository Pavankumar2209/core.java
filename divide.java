class divide{

	/*public static void main(String a[]){
	
	divide(500,5);
	divide(250,5);
	divide(1000,60);
	divide(500,10);
	divide(600,5);	
	}
		public static void divide(int number1, int number2){
		
		System.out.println ( number1 /  number2);
		}
}*/

	
	public static void main(String a[]){
	
	int total= divide(500,5);
	System.out.println(total);
	
	int total1 = divide(250,5);
	System.out.println(total1);
	
	int total2 = divide(1000,60);
	System.out.println(total2);
	
	
	int total3 = divide(500,10);
	System.out.println(total3);
	
	int total4 = divide(600,5);	
	System.out.println(total4);
	
	}
		public static int divide(int number1, int number2){
		
		return ( number1 /  number2);
		}
}