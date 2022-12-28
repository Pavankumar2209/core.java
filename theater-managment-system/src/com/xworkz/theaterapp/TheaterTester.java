package com.xworkz.theaterapp;

import com.xworkz.theaterapp.screens.Screens;
import com.xworkz.theaterapp.theater.Theater;

public class TheaterTester {

	
		public static void main(String[] args) {
			
			System.out.println("Main method started");
			
			
		Theater theaterDetails = new Theater();
		
		Screens screen = new Screens("Navarang Theater","RajajiNagar",1,"Vedha", "9:00 Am");
		Screens screen1 = new Screens("Bharathi Theater","JalahalliCross",2,"Avathar", "10:30 Am");
		Screens screen2 = new Screens("Mohan Theater","RajgopalNagar",3,"KGF2", "11:45 Am");
		Screens screen3 = new Screens("Maruthi Theater","Laggere",4,"RRR", "4:00 Pm");
		
		theaterDetails.saveTheaterDetails(screen);
		theaterDetails.saveTheaterDetails(screen1);
		theaterDetails.saveTheaterDetails(screen2);
		theaterDetails.saveTheaterDetails(screen3);
		
		
		theaterDetails.getTheater();
		theaterDetails.getTheaterByLocation("Laggere");
		theaterDetails.getTheaterByShowTiming("10:30 Am");
		theaterDetails.updateMovieNameByTheaterName("Kranti","Mohan Theater");
		
		}
}
