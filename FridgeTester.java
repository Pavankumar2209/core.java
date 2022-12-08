class FridgeTester{

		public static void main(String[] args){
		
		//object1
		Fridge details1= new Fridge();
		
		details1.brand="Haier";
		details1.price=8000.00;
		System.out.println(details1.brand+" "+details1.price);
		details1.toCold();
		
		
		//object2
		Fridge details2= new Fridge();
		details2.brand="Samsung";
		details2.price=11900.00;
		System.out.println(details2.brand+" "+details2.price);
		details2.toCold();
		
		
		//object3
		Fridge details3= new Fridge();
		
		details3.brand="LG";
		details3.price=14999.00;
		System.out.println(details3.brand+" "+details3.price);
		details3.toCold();
		
		
		//object4
		Fridge details4= new Fridge();
		
		details4.brand="Bosch";
		details4.price=17500.00;
		System.out.println(details4.brand+" "+details4.price);
		details4.toCold();
		
		
		//object5
		Fridge details5= new Fridge();
		
		details5.brand="WhirlPool";
		details5.price=14599.00;
		System.out.println(details5.brand+" "+details5.price);
		details5.toCold();
		
		}

}