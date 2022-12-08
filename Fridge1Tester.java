class Fridge1Tester{
	
										//concept: creating constructor for class and invoking constructor

		public static void main (String[] args){

		//creating objects
		
		Fridge1 fridge= new Fridge1("Haier",15000.00,"Red","40kgs","120 Ltrs");
		System.out.println(fridge.brandName+" "+fridge.weight+" "+fridge.capacity+" "+fridge.colour+" "+fridge.price);
		fridge.toCold();
		
		Fridge1 fridge1= new Fridge1("LG",18000.00,"Grey","45Kgs","130 Ltrs");
		System.out.println(fridge1.brandName+" "+fridge1.weight+" "+fridge1.capacity+" "+fridge1.colour+" "+fridge1.price);
		fridge1.toCold();
		
		Fridge1 fridge2 = new Fridge1("Samsung",17500.00,"Black","50Kgs","125 Ltrs");
		System.out.println(fridge2.brandName+" "+fridge2.weight+" "+fridge2.capacity+" "+fridge2.colour+" "+fridge2.price);
		fridge2.toCold();
		
		Fridge1 fridge3 =new Fridge1("Bosch",20000.00,"Metal Black","55Kgs","100 Ltrs");
		System.out.println(fridge3.brandName+" "+fridge3.weight+" "+fridge3.capacity+" "+fridge3.colour+" "+fridge3.price);
		fridge3.toCold();
		
		Fridge1 fridge4= new Fridge1("Godrej",13990.00,"Aqua wine","48Kgs","185 liters");
		System.out.println(fridge4.brandName+" "+fridge4.weight+" "+fridge4.capacity+" "+fridge4.colour+" "+fridge4.price);
		fridge4.toCold();
		
		Fridge1 fridge5= new Fridge1("Whirlpool",14990.00,"Blue","50Kgs","190 liters");
		System.out.println(fridge5.brandName+" "+fridge5.weight+" "+fridge5.capacity+" "+fridge5.colour+" "+fridge5.price);
		fridge5.toCold();
		
		Fridge1 fridge6= new Fridge1("Croma",10900.00,"Blue","45Kgs","190 liters");
		System.out.println(fridge6.brandName+" "+fridge6.weight+" "+fridge6.capacity+" "+fridge6.colour+" "+fridge6.price);
		fridge6.toCold();
		
		Fridge1 fridge7= new Fridge1("AmazoneBasics",53000.00,"Silver steel","95Kgs","564 liters");
		System.out.println(fridge7.brandName+" "+fridge7.weight+" "+fridge7.capacity+" "+fridge7.colour+" "+fridge7.price);
		fridge7.toCold();
		
		Fridge1 fridge8= new Fridge1("Ollies",3000.00,"silver colour","5Kgs","8liters");
		System.out.println(fridge8.brandName+" "+fridge8.weight+" "+fridge8.capacity+" "+fridge8.colour+" "+fridge8.price);
		fridge8.toCold();
		
		Fridge1 fridge9 =new Fridge1("Bosch",16400.00," Black","60Kgs","250 Ltrs");
		System.out.println(fridge9.brandName+" "+fridge9.weight+" "+fridge9.capacity+" "+fridge9.colour+" "+fridge9.price);
		fridge9.toCold();
		
		Fridge1 fridge10= new Fridge1("Godrej RF EON",18990.00,"Platinum Steel","50Kgs","225 liters");
		System.out.println(fridge10.brandName+" "+fridge10.weight+" "+fridge10.capacity+" "+fridge10.colour+" "+fridge10.price);
		fridge10.toCold();
		
		}

}