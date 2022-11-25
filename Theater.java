class Theater{

	static String name ="Bharathi Theater";
	static String name2 = "Navarang Theater";
	
	
	public static void info(String details){
	
	if(details=="Bharathi"){
	System.out.println("Show timings(9 am),(12 pm),(4pm) ");
	System.out.println("Ticket cost (250 Rs),(150 Rs),(220 Rs) ");
	}
	if(details=="Navarang"){
	System.out.println("Show timings(10 am),(1 pm),(6pm) ");
	System.out.println("Ticket cost (250 Rs),(250 Rs),(320 Rs) ");
	}
		
	return;	
	}

}