class Dunzo1Tester{

	public static void main(String[] args){
	
	double iteamWithQuantity1= Dunzo1.findIteam("Milk Packet",2);
	double iteamWithQuantity2= Dunzo1.findIteam("Parle biscuits",3);
	double iteamWithQuantity3= Dunzo1.findIteam("Amul Chees",2);
	double iteamWithQuantity4= Dunzo1.findIteam("Butter Milk Packet",2);
	
	
	
	System.out.println("The price of the iteam is"+iteamWithQuantity1);
	System.out.println("The price of the iteam is"+iteamWithQuantity2);
	System.out.println("The price of the iteam is"+iteamWithQuantity3);
	System.out.println("The price of the iteam is"+iteamWithQuantity4);
	
	
	
	}

}