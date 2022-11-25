class PrimeVideoMethod{

		static String hindiSeries[] = {"Panchayat", "Mirzapur1 ", "Mirzapur2 ","Family Man1", "Family Man2" ,
		"patal lok", "Pushpavalli", "Modern love mumbai", "Comicstaan","One mic stand",
		"Guilty Minds", "Best Seller", "Inside Edge", " Mumbai Diaries", "Hostel Daze"};
		
		static String kannadaMovies[] = {"Lucky man", "sarakari haraju", "KGF1", "KGF2", "Hope", "Yellow Board", "Yuvarthna", "love Mocktail", "love mocktail2", "Dia","ASN", "Old monl", 
		"Kotigobba3", "Robert", "Act1978" };
		
		static String foreignSeries[] = {"The peripheral", "The terminal list", "The boys", "Hudh Hudh", "The wheel of time", "Reacher", "Soldiers or Zombies", "Hanna", "FLEABAG", 
		"BOSCH legacy", "The expanse", "Good omens", "Upload", "The grand tour", "Yosi",};
		
		
		public static void getHindiSeries(){
		
			System.out.println("HINDI SERIES ARE:");
			for(int hindiseries=0; hindiseries<hindiSeries.length; hindiseries++)
			{
			System.out.println(hindiSeries[hindiseries]);
			}
		}
		
		public static void getKannadaMovies(){
		
			System.out.println("KANNADA MVOIES ARE:");
			for(int kannadamovies =0; kannadamovies<kannadaMovies.length;kannadamovies++)
			{
			System.out.println(kannadaMovies[kannadamovies]);
			}
		
		
		}

		
		public static void getforeignSeries(){
			
			System.out.println("FOREIGN SERIES ARE:");
			for(int foreignseries =0; foreignseries<foreignSeries.length;foreignseries++)
			{
			System.out.println(foreignSeries[foreignseries]);
			}
			
		}


	public static void main(String prime[]){
		getHindiSeries();
		getKannadaMovies();
		getforeignSeries();
		
	}


}