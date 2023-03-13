class Fan{


			//// method concept with condition
		static String brand = "Havells";
		static int wings = 3;
		static boolean isConnected;
		static int maxSpeed = 5;
		static int minSpeed;
		static int currentSpeed;
		

			public static void onOrOff(){
					
					System.out.println(" ON / OFF METHOD IS STARTED");
					
				if(isConnected==false){
					isConnected=true;
					System.out.println("Fan is Turned On");
						}
				else{System.out.println("Fan is Turned Off");
				}
					System.out.println(" ON / OFF METHOD IS ENDED");
			}
			
			
			public static void increaseSpeed(){
			
					System.out.println("increaseSpeed Method is Started");
					
				if(isConnected==true){
				
				if(currentSpeed<maxSpeed){
					currentSpeed= currentSpeed+1;
					System.out.println("The CurrentSpeed is"+" "+currentSpeed);
						}
				else{System.out.println("maxSpeed Reached");
						}
				}
				else{System.out.println("First turn On the Fan");
				}
					System.out.println("increaseSpeed Method is Ended");
			
			}
			
			public static void decreaseSpeed(){
			
					System.out.println("decreaseSpeed Method is Started");
					
				if(isConnected==true){
				
				if(currentSpeed>minSpeed){
					currentSpeed= currentSpeed-1;
					System.out.println("The CurrentSpeed is"+" "+currentSpeed);
						}
				else{System.out.println("maxSpeed Reached");
						}
				}
				else{System.out.println("First turn On the Fan");
				}
					System.out.println("decreaseSpeed Method is Ended");
			
			}			
			public static void main(String a[]){
			
					System.out.println("MAIN METHOD IS STARTED");
					
					onOrOff();
					increaseSpeed();
					increaseSpeed();
					increaseSpeed();
					increaseSpeed();
					decreaseSpeed();
					decreaseSpeed();
					decreaseSpeed();
					onOrOff();
					
					System.out.println("MAIN METHOD IS ENDED");

			}


}