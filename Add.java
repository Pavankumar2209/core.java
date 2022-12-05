class Add{

		public static int add(int num1, int num2){
	
		return num1+num2;
		}
	
		public static int add(int num1,int num2, int num3){
			return num1+num2+num3;
		}
	
	
		public static void main(String[] args){
		
		int total1= add(50,55);
		int totalA= add(50,50,50);
		System.out.println("Total of Two numbers:"+total1);
		System.out.println("Total of three numbers:"+totalA);
		
		System.out.println("_________________________________________________________");
		
		int total2= add(100,105);
		int totalB= add(100,200,300);
		System.out.println("Total of Two numbers:"+total2);
		System.out.println("Total of three numbers:"+totalB);
		
		
		System.out.println("_________________________________________________________");
		
		int total3= add(200,300);
		int totalC= add(200,300,400);
		System.out.println("Total of Two numbers:"+total3);
		System.out.println("Total of three numbers:"+totalC);
		
		}
	



}