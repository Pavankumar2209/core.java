package com.xworkz.encapsulationconcept.screens;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Screens1 {

	
	public Screens1() {
		
	}

	private String theaterName;
	private String location;
	private int screenNo;
	private String movieName;
	private String showTime;
	
	
	
	public Screens1(String theaterName, String location, int screenNo, String movieName, String showTime ) {
		
		this.theaterName= theaterName;
		this.location = location;
		this.screenNo = screenNo;
		this.movieName= movieName;
		this.showTime = showTime;
		
		
	}
	
	
	//getter and setter methods helps us to invoke private variables and methods
	/*
	public void setTheaterName(String theaterName) {
		this.theaterName= theaterName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation () {
		return location;
	}
	
	
	public void setScreenNo(int screenNo) {
		this.screenNo =screenNo;
	}
	public int getScreenNo() {
		return screenNo;
	}
	
	
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieName() {
		return movieName;
	}
	
	
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getShowTime() {
		return showTime;
	}*/
	
	
	
	
	
}
