class Zomato1{

	//Method over loading concept:
	
		public static double findIteam(String iteam){
		System.out.println("invoked findIteam()");
		
		if(iteam=="Biryani"){
			return 225.00;
		}
		
		if(iteam=="Pizza"){
			return 250.00;
		}
		if(iteam== "Burger"){
			return 185;
		}
		
		if(iteam=="Egg roll"){
			return 80;
		}
		if(iteam=="Veg roll"){
			return 75;
		}
		
		
		else{
			System.out.println("Iteam not available");
		}
		
		
		
		System.out.println("ended findIteam");
		
		
		return 0.0 ;
		}


	public static double findIteam(String iteam, int quantity){
		
		if(iteam=="Biriyani"){
			return 225.00*quantity;
		}
		if(iteam=="Pizza"){
			return 250.00*quantity;
		}
		if(iteam=="Burger"){
			return 185*quantity;
		}
		if(iteam=="Egg roll"){
			return 80*quantity;
		}
		if(iteam=="Veg roll"){
			return 75*quantity;
		}
		else{
			System.out.println("iteam not found");
		}
			
		return 0.0;
	}

}