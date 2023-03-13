class Swiggy{

		public static double findIteams(String iteam){
			
			System.out.println("invoked find iteames");
			
			if(iteam=="Noodles"){
			return 70;
			}
			
			if(iteam=="Pannier Butter Masala"){
			return 140;
			}
			
			if(iteam=="AaluBath"){
				return 60;
			}
			
			if(iteam=="Rotti Uta"){
				return 75;
			}
			if(iteam=="Gulab Jamoon"){
				return 50;
				
			}
			
			if(iteam=="Chicken Tandoori"){
				return 350;
			}
			
			if(iteam=="Curd Rice"){
				return 75;
			}
			
			if(iteam=="Jeera Rice"){
				return 75;
			}
			
			if(iteam=="Khara Pongal"){
				return 50;
				
			}
			
			if(iteam=="KesariBath"){
				return 50;
			}
		
			else{System.out.println("Iteam not found");
			}
			
			System.out.println("ended find iteams");		
		return 0.0;
		}


}