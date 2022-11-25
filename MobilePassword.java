class MobilePassword{

	static boolean isConnected;
	static String lock ="screen Lock is Opened";

	//method1
	public static void phone(){
	
		if(isConnected==false){
			isConnected=true;
			System.out.println("The phone is turned on");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("Turn on the phone");
		}
	}
	
	//method2
	public static void screenLock(String password){
		if(isConnected==true){
			
			if(password=="Pd@12345"){
			System.out.println("Screen Lock Opened");
			}
			else{System.out.println("Password Wrong");
			}
			
		}else{System.out.println("Turn on the Phone");
			}
				
	}

	

}