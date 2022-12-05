class Swiggy1Tester{

		public static void main(String[] args){
		
		double priceOfIteams1=Swiggy1.findIteams("Noodles");
		double priceOfIteams2=Swiggy1.findIteams("Pannier Butter Masala");
		double priceOfIteams3=Swiggy1.findIteams("AaluBath");
		double priceOfIteams4=Swiggy1.findIteams("Rotti Uta");
		double priceOfIteam5=Swiggy1.findIteams("Gulab Jamoon");
		
		double iteamWithQuantity6=Swiggy1.findIteams("Noodles",2);
		double iteamWithQuantity7=Swiggy1.findIteams("Pannier Butter Masala",3);
		double iteamWithQuantity8=Swiggy1.findIteams("AaluBath",2);
		double iteamWithQuantity9=Swiggy1.findIteams("Rotti Uta",3);
		double iteamWithQuantity10=Swiggy1.findIteams("Gulab Jamoon",2);
		
		
		
		
		System.out.println("The Iteam price is:"+priceOfIteams1);
		System.out.println("The Iteam price is:"+priceOfIteams2);
		System.out.println("The Iteam price is:"+priceOfIteams3);
		System.out.println("The Iteam price is:"+priceOfIteams4);
		System.out.println("The Iteam price is:"+priceOfIteam5);
		
		System.out.println("_________________________________________________________");
		
		System.out.println("The price of the iteam is:"+iteamWithQuantity6);
		System.out.println("The price of the  Iteam  is:"+iteamWithQuantity7);
		System.out.println("The price of the iteam  is:"+iteamWithQuantity8);
		System.out.println("The price of the Iteam  is:"+iteamWithQuantity9);
		System.out.println("The price of the Iteam  is:"+iteamWithQuantity10);
		
		
		}



}