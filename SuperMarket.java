class SuperMarket{

		static String fruites[]= {"Apple", "Banana", "Pinapalle", "Grapes", "mango","Strawberries", "Orange", "Pomogranate", "Watermelon", "Lemon"};
		static String vegetables[] ={"Patato", "Tomatos", "Cabbage", "carrot", "Peas", "Lad,sFingers", "Beetroot", "Drumstick", "Mushroom", "Brinjal"};
		static String chocolates[] = {"DairyMilk", "5 Star", "Perk", "Gems", "Kitkat", "Milkybar", "Snickers", "ChocoPie", "Coffy Bite", "Lotus Dark Chocolate"};
		static String biscuts[] = {"cadbury Oreo", "Parle-G", "Sunfeast ", "Good Day", "50-50", "Marie Gold", "Hide&sick", "Burbone", "Monaco", "Krack jack", "20-20", "Dark fantasy"};
		static String perfumes[] ={"Denver", "ARMANI", "FOGG", "Villain", "PARK AVENUE", "WILD STONE", "POLO"};
		static String kitchenset[] = {"knife set", "Lemon Squeezer", "peeler", "pan", "Dish rack", "Cups", "Bottles", "bowls", "Kettle", "Rooling pin", "Potato msdher"};
		static String shampoos[] = { "Head&Shoulder", "Clear", "Dove", "Sunsilk", "Himalaya", "Loreal", "TRESemme", "PANTENE", "Indulekha", "Vatika"};
		static String shoes[] = {"PUMA", "adidas", "sparks", "LCR", "NIKE"};
		static String cosmetics[] = {"Hair com", "hair Gel", "Facial pack", "Trimmer", "Hair Straightner", "Cruling Tong", "Skin care", "Face wash", "Makeup brush", "Lotion", "Sun care Products"};
		static String dryFruits[] = {"Almonds", "Cashews", "PeaNuts", "Dry Grapes", "walnuts", "dry fig", "Dates"};

	public static void main(String supermarket[]){
		
		System.out.println("Fruites Availables in Super market are:");
		for (int fruiteNames = 0; fruiteNames<fruites.length; fruiteNames++)
		{
			System.out.println(fruites[fruiteNames]);
		}
		
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Vegetables available in Super market are:");
		for (int vegetablenames =0; vegetablenames<vegetables.length; vegetablenames++)
		{
			System.out.println(vegetables[vegetablenames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("chocolates available in Super Market are:");
		for (int chocolatenames = 0; chocolatenames<chocolates.length; chocolatenames++)
		{
			System.out.println(chocolates[chocolatenames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("biscuts available in Super Market are:");
		for (int biscutsnames = 0; biscutsnames<biscuts.length; biscutsnames++)
		{
			System.out.println(biscuts[biscutsnames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("perfumes available in Super Market are:");
		for (int perfumesnames = 0; perfumesnames<perfumes.length; perfumesnames++)
		{
			System.out.println(perfumes[perfumesnames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("kitchenset available in Super Market are:");
		for (int kitcheniteams = 0; kitcheniteams<kitchenset.length; kitcheniteams++)
		{
			System.out.println(kitchenset[kitcheniteams]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Shampoos available in Super Market are:");
		for (int shampoonames = 0; shampoonames<shampoos.length; shampoonames++)
		{
			System.out.println(shampoos[shampoonames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("Shoes available in Super Market are:");
		for (int shoebrandnames = 0; shoebrandnames<shoes.length; shoebrandnames++)
		{
			System.out.println(shoes[shoebrandnames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("cosmetics available in Super Market are:");
		for (int cosmeticsIteamnames = 0; cosmeticsIteamnames<cosmetics.length; cosmeticsIteamnames++)
		{
			System.out.println(cosmetics[cosmeticsIteamnames]);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("DryFruits available in Super Market are:");
		for (int dryFruitnames = 0; dryFruitnames<dryFruits.length; dryFruitnames++)
		{
			System.out.println(dryFruits[dryFruitnames]);
		}
	
	
	}
}