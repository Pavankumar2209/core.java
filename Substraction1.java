class Substraction1{

		public static int sub(int num1, int num2){
		return num1-num2;
		}
		
		public static int sub(int num1 , int num2, int num3){
		return num1-num2-num3;
		}
		
		
		public static void main(String[] args){
		
		int total1= sub(500,100);
		int totalA = sub(800,300,200);
		System.out.println("Substraction of Two numbers:"+total1);
		System.out.println("Substraction of three numbers:"+totalA);
		
		System.out.println("_________________________________________________________");
		
		
		int total2= sub(500,300);
		int totalB = sub(1500,1000,200);
		System.out.println("Substraction of Two numbers:"+total2);
		System.out.println("Substraction of of three numbers:"+totalB);
		
		System.out.println("_________________________________________________________");
		
		int total3 = sub(5000,2000);
		int totalC = sub(5000,500,200);
		System.out.println("Substraction of Two numbers:"+total3);
		System.out.println("Substraction of three numbers:"+totalC);
		
		
		
		
		}


}