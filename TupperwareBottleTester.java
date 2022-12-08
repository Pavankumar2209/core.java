class TupperwareBottleTester{

			//Class and Object Concept
			
		public static void main(String[] args){
		
		//creating object with keyword "new"
		TupperwareBottle tupperwareBottle= new TupperwareBottle();
		
		tupperwareBottle.colour ="blue";
		tupperwareBottle.shape ="Cylinder ";
		tupperwareBottle.price = 50.00;
		tupperwareBottle.type ="Plastic";
		
		//method calling
		tupperwareBottle.toStoreLiquids();
		
		
		System.out.println(tupperwareBottle.colour+" "+ tupperwareBottle.shape+" "+ tupperwareBottle.price+ " "+ tupperwareBottle.type);
		
		
		
		
		//creating another object
		TupperwareBottle bottle1 = new TupperwareBottle();
		
		bottle1.colour="Red";
		bottle1.shape="Square";
		bottle1.price=55.00;
		bottle1.type= "steel";
		
		System.out.println(bottle1.colour+" "+bottle1.shape+" "+bottle1.price+" "+bottle1.type);
		
		
		
		//creating another method 
		TupperwareBottle bottle2= new TupperwareBottle();
		
		bottle2.colour="Green";
		bottle2.shape= "Cylinder";
		bottle2.price=70.00;
		bottle2.type= "Plastic";
		
		System.out.println(bottle2.colour+" "+bottle2.shape+" "+bottle2.price+" "+bottle2.type);
		
		
		//creating another method
		TupperwareBottle bottle3 =new TupperwareBottle();
		
		bottle3.colour= "blak";
		bottle3.shape= "Cylindrical";
		bottle3.price= 65.00;
		bottle3.type= "steel";
		
		System.out.println(bottle3.colour+" "+bottle3.shape+" "+bottle3.price+" "+bottle3.type);
		
		}	
	
}
