class MobileTester{

		public static void main(String[] args){
		
		
		Mobile info1= new Mobile();
		
		//getting output as default values bcz values are not assigned 
		System.out.println(info1.brand+" "+info1.price);
		
		/*info1.brand=" ";
		info1.price= ;
		System.out.println(info1.brand+" "+info1.price);*/
		
		info1.brand="i Phone";
		info1.price=75000.00;
		info1.BrandAndCost();
		System.out.println(info1.brand+" "+info1.price);  // getting ouput which are assigned for variables 
				
		
		Mobile info2= new Mobile();
		
		System.out.println(info2.brand+" "+info2.price);
		
		info2.brand="Samsung";
		info2.price=18000.00;
		info2.BrandAndCost();
		System.out.println(info2.brand+" "+info2.price);
				
		
		Mobile info3= new Mobile();
		
		System.out.println(info3.brand+" "+info3.price);
		
		info3.brand="Redmi";
		info3.price=15000.00;
		info3.BrandAndCost();
		System.out.println(info3.brand+" "+info3.price);
		
			
		Mobile info4= new Mobile();
		
		System.out.println(info4.brand+" "+info4.price);
		
		info4.brand="Oppo";
		info4.price=17500.00;
		info4.BrandAndCost();
		System.out.println(info4.brand+" "+info4.price);
			
		
		Mobile info5= new Mobile();
		
		System.out.println(info5.brand+" "+info5.price);
		
		info5.brand="one plus";
		info5.price=30000.00;
		info5.BrandAndCost();
		System.out.println(info5.brand+" "+info5.price);
		
		
		}

}