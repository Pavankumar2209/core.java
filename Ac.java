class Ac{
			
				//// method concept with condition
			static String brand = "Blue Star";
			static String capacity = "1.5 ton";
			static boolean isConnected;
			static int minTemp ;
			static int maxTemp = 35;
			static int currentTemp = 25;
				
				
				
			public static void onOrOff(){
				
					System.out.println("ON OR OFF METHOD STARTED");
					
				if(isConnected==false){
						isConnected= true;
						System.out.println("The AC is Turned On");
					}
				else if(isConnected== true){
						isConnected= false;
						System.out.println("The AC is Turned off");
					}
			}
				
			public static void increasetemp(){
					System.out.println("INCREASE METHOD STARTED");
					
				if(isConnected==true){
					
				if(currentTemp<maxTemp){
						currentTemp = currentTemp+1;
						System.out.println(" The current Temp is"+" "+currentTemp);
					}
				else {System.out.println("maxTemp Reached");
						}
				}
				else{System.out.println("First Turn On The Ac");
				}
			
					System.out.println("INCREASE METHOD ENDED");
			}
				
				
			public static void decreaseTemp(){
				
					System.out.println("DECREASE METHOD STARTED");
				
				if(isConnected==true){
				
				if(currentTemp>minTemp){
					currentTemp = currentTemp-1;
					System.out.println("The currentTemp is"+" "+currentTemp);
					}
				else{ System.out.println("Min Temp Reached");
						}
				}
				else{System.out.println("First Turn On The Ac");
				}
				
					System.out.println("DECREASE METHOD ENDED");
			}			
			public static void main(String a[]){
				
					System.out.println("THE MAIN METHOD IS STARTED");
					
					onOrOff();
					increasetemp();
					increasetemp();
					increasetemp();
					decreaseTemp();
					decreaseTemp();
					decreaseTemp();
					onOrOff();
					
					System.out.println("THE MAIN METHOD IS ENDED");
			}



}