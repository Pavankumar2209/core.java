class Speaker{

	//// method concept with condition
	static String brandName = "Bose";
	static String frequency = "50Hz ";
	static boolean isWireless = true;
	static boolean isConnected ;
	static int minVolume ;
	static int maxVolume = 5;
	static int currentVolume ;
	
	
	
	public static void onOrOff(){
	
		System.out.println("inside On or Off method");
		
		//functionality
		if(isConnected== false){
			isConnected = true;
			System.out.println("Speaker is turned on....enjoy");
		}else if(isConnected== true){
			isConnected= false;
			System.out.println("Speaker is turned off");
		}
		
		System.out.println("on or Off Method ended");
		
		
	}
	
	public static void increaseVolume(){
		System.out.println("Increase volume method is started");
		
	if (isConnected==true){
		if(currentVolume<maxVolume){
			currentVolume= currentVolume+1;
			System.out.println("The current volume is"+currentVolume);
		}else{
				System.out.println("max Volume Reached");
		}
	}else{System.out.println("Hey man First  Turn on the Speaker");
		}	
		
	
	}	
	
	public static void decreseVolume(){
		System.out.println("Decrese volume methode started");
	if (isConnected==true){
		if(currentVolume>minVolume){
			currentVolume= currentVolume-1;
			System.out.println("The currentVolume is "+currentVolume);
		}else {
				System.out.println("min Volume Reached");
		}
	}else{System.out.println("Hey man First  Turn on the Speaker");
		}
	}
		
		public static void main(String a[]){
		
		//System.out.println("Brand name is"+" " +brandName);
		//System.out.println("Brand Frequency is"+" "+frequency);
		//System.out.println("is Speaker  is wireless"+" " +isWireless);
		//System.out.println("Minmum Volume of the speaker"+" " +minVolume);
		//System.out.println("Maximum Volume of the Speaker"+" " +maxVolume);
		//System.out.println("Current Volume of the Speaker is"+" " +currentVolume);
		
		System.out.println("main method Started");
		
		onOrOff();
		//onOrOff();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		decreseVolume();
		decreseVolume();
		decreseVolume();
		decreseVolume();
		onOrOff();
		System.out.println("main method ended");
		}
	
}