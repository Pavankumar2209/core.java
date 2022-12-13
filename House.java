class House{
	
		public int id;
		public String name;
		public String ownerName;
		public String[] familyMembers;
		
		
	public House(int id,String name,String ownerName,String[] familyMembers){
		
		this.id=id;
		this.name=name;
		this.ownerName=ownerName;
		this.familyMembers=familyMembers;
	}
		public void displayDetails(){
	
		System.out.println("Displaying House details");
		
		System.out.println("The House name is "+this.name);
		
		System.out.println("The House ownerName  is "+this.ownerName);
		
		System.out.println("Family Members in house are :");
		for(int index=0; index<familyMembers.length;index++){
		System.out.println(familyMembers[index]);
		}
		
		
		
		}
		
		
		
		
		
	



}