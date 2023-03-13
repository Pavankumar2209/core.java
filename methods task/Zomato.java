class Zomato{

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
		if(iteam=="masala dosa"){
			return 65;
			
		}
		if(iteam=="Puliogare"){
			return 60;
		}
		if(iteam=="Gee Rice"){
			return 120;
		}
		if(iteam=="Mushroom palav"){
			return 100;
		}
		if (iteam=="puri sagu"){
			return 85;
		}
		
		else{
			System.out.println("Iteam not available");
		}
		
		
		
		System.out.println("ended findIteam");
		
		
		return 0.0 ;
		}



}