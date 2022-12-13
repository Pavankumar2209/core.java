class StationeryTester{

		public static void main(String[] args){
		
		String noteBooks[]={"100 Pages ","200 pages","200 pages KingSize book","100 Pages LongSize book"};
		String pens[]={"Butter flow","Mountex","Reynolds","Reynodls Brite"};
		String charts[]={"Blue Chart paper","Yellow Chart paper","White chart paper","Pink chart paper"};
		
		Stationery stn= new Stationery(234,"Raghavendra Stationeries",noteBooks,pens,charts);
		stn.displayingDetails();
		
		
		}




}