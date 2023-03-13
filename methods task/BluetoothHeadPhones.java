class BluetoothHeadPhones{

		static String brand = "Boat Rockerz 330Anc";
		static String colour = "Black";
		static double price = 1499.00;
		static boolean isConnected;
		static int maxVolume = 10;
		static int minVolume ;
		static int currentVolume;
		
		//method 1
		
		public static void onOrOff(){
		
		System.out.println("The on or Off method started");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The BluetoothHeadPhones is turned on");
		}
		else if (isConnected==true){
				isConnected=false;
			System.out.println("The BluetoothHeadPhones is turned off");
			}
	
		}
		
		


}