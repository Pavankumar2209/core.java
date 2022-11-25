class ZeptoTesterrr{

	public static void main(String iteam[]){
		
	//double findIteams=Zepto.findGroceryIteams("Sonamasoori Rice","Ashirvaad weat Atta","Puliogare Powder","Red Chilli Powder","Toor Dall");
		double findIteams=Zepto.findGroceryIteam(zeptofindGroceryIteams[]);
		String zeptofindGroceryIteams[]={"Sonamasoori Rice","Ashirvaad weat Atta","Puliogare Powder","Red Chilli Powder","Toor Dall"};
	
	
		for(int zeptofindGroceryIteam =0;zeptofindGroceryIteam<ZeptofindGroceryIteams.length;zeptofindGroceryIteam++){
		System.out.println( ZeptofindGroceryIteams[zeptofindGroceryIteam]);
		}
	
		
		
		System.out.println("The price is :"+findIteams);
	}


}