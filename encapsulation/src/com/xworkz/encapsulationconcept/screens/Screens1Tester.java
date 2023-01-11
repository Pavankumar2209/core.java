package com.xworkz.encapsulationconcept.screens;
import java.util.Scanner;

public class Screens1Tester {
	
	
	public static void main(String[] args) {
		
		Screens1 screen = new Screens1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Theater Name");
		screen.setTheaterName(sc.next());
		
		System.out.println("Enter Location");
		screen.setLocation(sc.next());
		
		System.out.println("Enter Screen No");
		screen.setScreenNo(sc.nextInt());
		
		System.out.println("Enter Movie Name");
		screen.setMovieName(sc.next());
		
		System.out.println("Enter Show Time");
		screen.setShowTime(sc.next());
		
		
		System.out.println(screen.getTheaterName()+" "+ screen.getLocation()+" "+screen.getScreenNo()+" "+screen.getMovieName()+" "+screen.getShowTime());
		
		
		
		sc.close();
		
	}
	

}
