package com.xworkz.bar;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;  
import lombok.NoArgsConstructor;



@Getter
@Setter
@NoArgsConstructor   //here we used annotations to create constructors 
@AllArgsConstructor

public class Bar {
	
	private int id;
	private String barName;
	private String location;
	private String ownerName;
	
	
	
	@Override   // here we Override the toString Method from object class to call the reference variable of object
	public String toString() {
		
		return "Bar - (Id = "+this.id+", Bar Name = "+this.barName+", Location = "+this.location+", Owner Name = "+this.ownerName+")";
	}
	
	
	
	
	
	
	//object class equals method compare references so below we override the object class equals method and implemented so that we can compare datas .
	//overriding the equals method from object class
	//and implemented to comapre datas of the reference
	
	
	@Override     //equals method from object class
	public boolean equals(Object obj) {
	
		//downcasting
	Bar	bar=(Bar)obj;
	
				// to compare two string values we used equals method from string class
	if(this.location.equals(bar.location)) {
		return true;	
	}
	if(this.barName.equals(bar.barName) || this.ownerName.equals(bar.ownerName)) {
		return true;
	}
	
	if(this.id == bar.id) {
		return true;
	}
	
	return false;
	}
	
	
	
	//here we override the hashcode method from object class and implemented to get unique number of bar class data id.
	@Override
	public int hashCode() {
		
		return this.id;
	}

	
}
