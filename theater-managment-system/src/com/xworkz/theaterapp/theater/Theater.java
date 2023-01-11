package com.xworkz.theaterapp.theater;

import com.xworkz.theaterapp.screens.Screens;

public class Theater {
	
	Screens screens[] = new Screens[4];
	int index;
	
	public Theater() {
		System.out.println("object is Created");
		
	}
	
	public boolean saveTheaterDetails(Screens screens) {
		
		boolean isSavedTheaterDetails = false;
		System.out.println("inside save method");
		
		if(screens.theaterName!=null && !screens.theaterName.isEmpty()) {
			
			this.screens[index++]=screens;
			System.out.println("theaterr details are saved");
			isSavedTheaterDetails= true;
			
			
		}else {
			System.out.println("Theater can not be null or empty");
		}
			
		return isSavedTheaterDetails;
	}
	
	
	public void getTheater() {
		
		for(int i=0; i<screens.length;i++ ) {
			
			System.out.println(screens[i].theaterName+" "+screens[i].location+" "+ screens[i].screenNo+ " "+ screens[i].movieName+ " "+ screens[i].showTime);
			
		}
	}
	
	public Screens getTheaterByLocation(String loaction) {
		System.out.println("getTheaterByLocation method started");
		for(int i=0; i<screens.length; i++) {
			if(screens[i].location==loaction) {
				System.out.println("String location is matched....proceed with ");
				System.out.println(screens[i].theaterName+" "+screens[i].location+" "+ screens[i].screenNo+ " "+ screens[i].movieName+ " "+ screens[i].showTime);
				return screens[i];
			}
		}
	return null;
	}
	
	public Screens getTheaterByShowTiming(String showTime) {
		
		for(int i1=0; i1<screens.length; i1++) {
			System.out.println("getTheaterByshowTiming method started");
			if(screens[i1].showTime==showTime) {
				System.out.println("String ShowTime is matched.....proced with ");
				System.out.println(screens[i1].theaterName+" "+screens[i1].location+" "+screens[i1].screenNo+" "+screens[i1].movieName+" "+screens[i1].showTime);
				return screens[i1];
			}
		}
		
		return null;
	}
	
	
	
	public Screens updateMovieNameByTheaterName(String newMovie, String theaterName) {
		
		for(int i2=0; i2<screens.length; i2++) {
			System.out.println("updateMovieNameByTheaterName Method started");
			if(screens[i2].theaterName==theaterName) {
				System.out.println("String Theater Name is Matched....Proced with updating");
				System.out.println("The Current Movie Running  in the Theater is:"+ screens[i2].movieName);
				screens[i2].movieName=newMovie;
				System.out.println("The Upcoming Movie in the Theater is:"+ screens[i2].movieName);
			}
			
		}
		return null;
	}
	

}
