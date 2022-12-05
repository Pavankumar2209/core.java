class Zomato1Tester{

	// Method over loading concept :

	public static void main(String zomato[]){
		
		
	//to get data from Zomato file we need to use class name and . after that we need to add method name which i want to invoke.
		
		
		double iteamWithQuantity1 =Zomato1.findIteam("Biriyani",3);
		double iteamWithQuantity2 =Zomato1.findIteam("Pizza",2);
		double iteamwithQuantity3 =Zomato1.findIteam("Burger",3);
		double iteamWithQuantity4 =Zomato1.findIteam("Egg roll",2);
		double iteamWithQuantity5= Zomato1.findIteam("Veg roll",4);
		
		
		System.out.println("The Price of the selected iteam is :"+iteamWithQuantity1);
		System.out.println("The Price of the selected iteam  is :"+iteamWithQuantity2);
		System.out.println("The Price of the selected iteam  is :"+iteamwithQuantity3);
		System.out.println("The Price of the selected iteam  is :"+iteamWithQuantity4);
		System.out.println("The Price of the selected iteam  is :"+iteamWithQuantity5);
		
		
	
	}
}