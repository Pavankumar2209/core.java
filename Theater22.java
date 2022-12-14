class Theater22{

			public int id;
			public String name;
			public int noOfScreens;
			public String typesOfScreens[];
			
			
			
				//Constructor
			public Theater22(int id, String name, int noOfScreens, String typesOfScreens[]){
			
			this.id=id;
			this.name=name;
			this.noOfScreens=noOfScreens;
			this.typesOfScreens=typesOfScreens;
			
			}
			

			//method
		public void detailsOfTheater(){
			
			System.out.println("Displaying the details of theater");
			
			System.out.println("Theater id is: "+this.id);
			
			System.out.println("Theater name is: "+this.name);
			
			System.out.println("No of Screens in Theater are: "+this.noOfScreens);
			
			System.out.println("Types of screens  in theater are");
			for (int index=0; index<typesOfScreens.length;index++){
			System.out.println(typesOfScreens[index]);
			};
			
		}


}