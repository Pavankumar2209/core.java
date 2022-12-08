class AC1Tester{

		public static void main(String[] args){
		
		//object1
		AC1 detail1= new AC1();
		
		detail1.brand="LG";
		detail1.price=12000.00;
		System.out.println(detail1.brand+" "+detail1.price);
		detail1.temp();
		
		
		//object2
		AC1 detail2= new AC1();
		detail2.brand="Samsung";
		detail2.price=15000.00;
		System.out.println(detail2.brand+" "+detail2.price);
		detail2.temp();
		
		
		//object3
		AC1 detail3= new AC1();
		detail3.brand="Voltas";
		detail3.price=10000.00;
		System.out.println(detail3.brand+" "+detail3.price);
		detail3.temp();
		
		
		//object4
		AC1 detail4= new AC1();
		detail4.brand="Carrier";
		detail4.price=12500.00;
		System.out.println(detail4.brand+" "+detail4.price);
		detail4.temp();
		
		
		//object5
		AC1 detail5= new AC1();
		detail5.brand="WhirlPool";
		detail5.price=15400.00;
		System.out.println(detail5.brand+" "+detail5.price);
		detail5.temp();
		
		}

}