class Trains{

	static String stationName = "KSR Bengaluru";
	static String trainNames[] = {"bidar ypr express", "udyan express","nanded express","hasan solapur express"};
	static boolean isfromKSRBengaluru;
	static String from ="Mejestic bengaluru";
	static String to ="Kalaburagi";
	
//method 1
	public static void trainName(){
		
		for(int list=0;list<trainNames.length;list++){
			System.out.println(trainNames[list]);
		}
	
		if(isfromKSRBengaluru==false){
			isfromKSRBengaluru=true;
			System.out.println("The train names"+trainNames);
	
		}else if(isfromKSRBengaluru==true){
			isfromKSRBengaluru=false;
			System.out.println(" Trains not available");
		}
	
	}


//method 2
	public static void train(String fromAndTo){
		if(isfromKSRBengaluru==true){
			if(fromAndTo=="Mejestic to Kalaburagi"){
			System.out.println("Trains available"+" "+trainNames[0]+" "+trainNames[1]+" "+trainNames[3]);
			 return;
			 }
			else{System.out.println("Direct Trains not available on this route");
			}
		}else{System.out.println("Trains not available");
		}
	}


	
}