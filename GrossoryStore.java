class GrossoryStore{
	
		public int id;
		public String name;
		public String location;
		public String[] iteams;
		
		
	public GrossoryStore(int id,String name,String location,String[] iteams){
		
		this.id=id;
		this.name=name;
		this.location=location;
		this.iteams=iteams;
	}
		public void displayDetails(){
	
		System.out.println("Displaying GrossoryStore details");
		
		System.out.println("The Store name is "+this.name);
		
		System.out.println("The Store location name is "+this.location);
		
		System.out.println("The iteams which i want to buy in store");
		for(int index=0; index<iteams.length;index++){
		System.out.println(iteams[index]);
		}
		
		
		
		}
		
		
		
		
		
	



}