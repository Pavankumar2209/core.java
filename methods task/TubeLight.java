class TubeLight{

		static boolean isConnected = false;
		
		public static void main(String a[]){
		//invoking a giveLight methode
		giveLight();
		giveLight();
		}
		
		//declaration of a giveLight methode
		public static void giveLight(){
		
			System.out.println("giveLight methode started");
		
		if(isConnected == false){
			isConnected=true;
			System.out.println("tubeLight is turned on");
		}
		
		else {System.out.println("switch is already turned on");
			System.out.println(" ");
		}
	}
}