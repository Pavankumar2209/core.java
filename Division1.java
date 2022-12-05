class Division1{

		//Method over loading concept:
		
		public static int divid(int num1, int num2){
		return num1/num2;
		}
		
		public static int divid(int num1 , int num2, int num3){
		return num1/num2/num3;
		}
		
		
		public static void main(String[] args){
		
		int total1= divid(25,5);
		int totalA = divid(100,3,2);
		System.out.println("Division of Two numbers:"+total1);
		System.out.println("Division of three numbers:"+totalA);
		
		System.out.println("_________________________________________________________");
		
		
		int total2= divid(200,10);
		int totalB = divid(500,2,2);
		System.out.println("Division of Two numbers:"+total2);
		System.out.println("Division of of three numbers:"+totalB);
		
		System.out.println("_________________________________________________________");
		
		int total3 = divid(20,2);
		int totalC = divid(600,3,2);
		System.out.println("Division of Two numbers:"+total3);
		System.out.println("Division of three numbers:"+totalC);
		
		
		
		
		}


}