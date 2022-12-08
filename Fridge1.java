class Fridge1{

												//concept: creating constructor for class 
				
		String brandName;
		String colour;
		double price;
		String weight;
		String capacity;
		
		
		//Default Constructor: no parameters given 
		
		/*public fridge1(){
			brandName=bName;
			colour=colr;
			price=prc;
			weight=wght;
			capacity=cpty;
			
		}*/
		
		
		
		//creating Constructor (Parameterized Constructor)
		public Fridge1(String bName, double prc,String colr, String wght, String cpty){
		
		brandName=bName;
		colour=colr;
		price=prc;
		weight=wght;
		capacity=cpty;
			
		}
		
		public void toCold(){
		System.out.println("Fridge is used to keep food cold");
		
		}
		

}