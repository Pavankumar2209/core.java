class Speaker1Tester{

		public static void main(String[] args){
		
		//creating object1
		Speaker1 speakerA= new Speaker1();
		
		//state, properties,variables,fields,
		speakerA.brand="Sony";
		speakerA.price=5000.00;
		String song1="speakerA.outPut()";
		
		System.out.println(speakerA.brand+" "+speakerA.price);
		
		System.out.println("varaha roopam"+song1);
		
		
		//object2
		Speaker1 speakerB= new Speaker1();
		
		speakerB.brand= "Philips";
		speakerB.price=6000.00;
		System.out.println(speakerB.brand+" "+speakerB.price);
		
		//object3
		Speaker1 speakerC= new Speaker1();
		
		speakerC.brand= "Boat";
		speakerC.price=8000.00;
		System.out.println(speakerC.brand+" "+speakerC.price);
		
		//object4
		Speaker1 speakerD= new Speaker1();
		
		speakerD.brand= "JBL";
		speakerD.price=4500.00;
		System.out.println(speakerD.brand+" "+speakerD.price);
		
		
		//object5
		Speaker1 speakerE= new Speaker1();
		
		speakerE.brand= "AHUJA speaker";
		speakerE.price=4500.00;
		System.out.println(speakerE.brand+" "+speakerE.price);
		
		
	
		
		}




}