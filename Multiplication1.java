class Multiplication1{

		public static int multi(int num1, int num2){
		return num1*num2;
		}
		
		public static int multi(int num1 , int num2, int num3){
		return num1*num2*num3;
		}
		
		
		public static void main(String[] args){
		
		int total1= multi(5,5);
		int totalA = multi(5,3,2);
		System.out.println("Multiplication of Two numbers:"+total1);
		System.out.println("Multiplication of three numbers:"+totalA);
		
		System.out.println("_________________________________________________________");
		
		
		int total2= multi(10,5);
		int totalB = multi(10,5,2);
		System.out.println("Multiplication of Two numbers:"+total2);
		System.out.println("Multiplication of of three numbers:"+totalB);
		
		System.out.println("_________________________________________________________");
		
		int total3 = multi(20,2);
		int totalC = multi(20,5,2);
		System.out.println("Multiplication of Two numbers:"+total3);
		System.out.println("Multiplication of three numbers:"+totalC);
		
		
		
		
		}


}