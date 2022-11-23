class Apple{

		static String name;
		static double cost;
	public static void main(String Apple[])
	{
		System.out.println("Invoking Variables before initialization");
		System.out.println("=================================");
		System.out.println("Fruite name is "+name);
		System.out.println("Fruite cost is "+cost);
	
		name = "Apple";
		cost = 155.5;
		
		System.out.println("Invoking Variables after initialization");
		System.out.println("=================================");
		System.out.println("Fruite name is "+name);
		System.out.println("Fruite cost is "+cost);
	
	
	}
}