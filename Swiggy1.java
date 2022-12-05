class Swiggy1{

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
			
			
			else{System.out.println("Iteam not found");
			}
			
			System.out.println("ended find iteams");		
		return 0.0;
		}


	public static double findIteams(String iteam,int quantity){
		
		if(iteam=="Noodles"){
			return 70*quantity;
		}
		if(iteam=="Pannier Butter Masala"){
			return 140*quantity;
		}
		if(iteam=="Rotti Uta"){
			return 75*quantity;
		}
		if(iteam=="Gulab Jamoon"){
			return 50*quantity;
		}
		if(iteam=="AaluBath"){
			return 60*quantity;
		}
		else{
			System.out.println("Iteam can not found ");
		}
		
		return 0.0;
	}
}