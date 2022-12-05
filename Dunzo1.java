class Dunzo1{

	public static double findIteam(String iteam){
	
		if(iteam=="Milk Packet"){
		return 40.00;
		}
		if(iteam=="Parle biscuits"){
		return 45.00;
		}
		if(iteam=="Amul Chees"){
		return 80.00;
		}
		if(iteam=="Butter Milk Packet"){
		return 20.00;
		}
		else{System.out.println("Iteam not found");
		}
	
		return 0.0;
		}
	
	

	public static double findIteam(String iteam, int quantity){
		
		if(iteam=="Milk Packet"){
			return 40.00*quantity;	
		}
		if(iteam=="Parle biscuits"){
			return 45.00*quantity;
		}
		if(iteam=="Amul Chees"){
			return 80.00*quantity;
		}
		if(iteam=="Butter Milk Packet"){
			return 20.00*quantity;
		}
		else{System.out.println("Iteam not found");
		}
		
		return 0.0;
		}
	



}