class CricketManiaMethod{

		static String topBatsmansInOdi[] = {"Babar Azam", "Rassie van der dussen", "Iman-ul-Haq", "de Kock", "Virat Kohli"};
		static int highestScore[] = {264,237,215,209,200};
		static String top5wicketTakerInOdi[] = {"M Muralidaran", "Wasim Akram", "A Kumble", "J srinath", "Z Khan"};
		static int highestNoOfWorldCupWinners[] = {5,2,2,1,1,1};
		
		
	public static void battingRanking(){
	
		System.out.println("Men,s ODI Batting Rankings are:");
		
			for (int batsmans = 2; batsmans<topBatsmansInOdi.length;batsmans++)
			{ 
			System.out.println(topBatsmansInOdi[batsmans]);
			}
	}	
	
	public static void highestRunScores(){
		System.out.println("TOp 5 highest run scores in ODI cricket :");
		//System.out.println(highestScore[0]+" " + highestScore[1]+ " " + highestScore[2]+ " " + highestScore[3]+ " " + highestScore[4]);
		
			for(int scores = 2; scores<highestScore.length ; scores++) 
			{ 
			System.out.println(highestScore[scores]);
			}
	}	
		
	public static void top5WicketTakers(){	
		
		System.out.println("Top 5 Wicket Takers In ODI :");
		//System.out.println(top5wicketTakerInOdi[0]+" " +top5wicketTakerInOdi[1]+" " +top5wicketTakerInOdi[2]+ " " +top5wicketTakerInOdi[3]+ " " +top5wicketTakerInOdi[4]);
		
			for (int wickets = 2; wickets<top5wicketTakerInOdi.length; wickets++)
			{
				System.out.println(top5wicketTakerInOdi[wickets]);
			}
	}


	public static void worldCupWinnwers(){
	
		System.out.println(" Highest Number of World Cup Winners In Cricket : ");
		//System.out.println("Australia"+highestNoOfWorldCupWinners[0]+" "+ "India"+highestNoOfWorldCupWinners[1]+ " " +"West indies"+highestNoOfWorldCupWinners[2]+" "+ 
		//"Pakisthan"+highestNoOfWorldCupWinners[3]+ " " + "Srilankha"+highestNoOfWorldCupWinners[4]+" " + "England"+ highestNoOfWorldCupWinners[5]);
		
			for (int winners = 2; winners<highestNoOfWorldCupWinners.length;winners++)
			{
					System.out.println(highestNoOfWorldCupWinners[winners]);
			}
		
	}	
			
	
	public static void main(String methods[]){
				
		battingRanking();
		highestRunScores();
		top5WicketTakers();
		worldCupWinnwers();
		
		
	}
				
				
				
				
	


}
