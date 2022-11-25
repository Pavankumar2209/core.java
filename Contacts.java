class Contacts{
	static long pavan = 9876543211l;
	static long manoj = 9988776655l;
	static long kishan = 8899776655l;
	
	public static void contactList(String names){
	
		if(names=="Pavan"){
		System.out.println("Pavan Contact num is"+" "+pavan);
		return;
		}
	
		if(names=="manoj"){
		System.out.println("manoj Contact num is"+" "+manoj);
		return;
		}
		
		if(names=="kishan"){
			System.out.println("kishan Contact num is"+" "+kishan);
			return;
		}
	
	return ;
	}


}