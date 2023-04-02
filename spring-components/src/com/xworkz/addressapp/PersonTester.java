package com.xworkz.addressapp;

import com.xworkz.addressapp.address.Address;
import com.xworkz.addressapp.address.Area;
import com.xworkz.addressapp.address.City;
import com.xworkz.addressapp.address.Country;
import com.xworkz.addressapp.address.State;
import com.xworkz.addressapp.address.Street;
import com.xworkz.addressapp.person.Person;

public class PersonTester {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setId(1);
		person.setName("Praveen");
		
		Address address = new Address();
		Country country = new Country();
		State state = new State();
		City city = new City();
		Area area = new Area();
		Street street = new Street();
		
		street.setStreetNo("No:55 , 3rd main , 8th cross");
		street.setStreetName("KR Puram");
		
		area.setStreet(street);
		city.setArea(area);
		state.setCity(city);
		country.setState(state);
		address.setCountry(country);
		person.setAddress(address);
		
		System.out.println(person);
		
	}

}
