package com.xworkz.addressapp.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.addressapp.springconfiguration.SpringConfiguratinos;
import com.xworkz.addressapp.task1.bar.Bar;
import com.xworkz.addressapp.task1.building.Building;
import com.xworkz.addressapp.task1.channel.Channel;
import com.xworkz.addressapp.task1.clients.Company;
import com.xworkz.addressapp.task1.gun.Gun;
import com.xworkz.addressapp.task1.hotel.Hotel;
import com.xworkz.addressapp.task1.house.House;
import com.xworkz.addressapp.task1.institute.Institute;
import com.xworkz.addressapp.task1.juice.Juice;
import com.xworkz.addressapp.task1.phone.Phone;
import com.xworkz.addressapp.task1.team.Team;

public class Tester {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguratinos.class);
		
		House house = applicationContext.getBean("house",House.class);
		System.out.println(house);
		
		Team team = applicationContext.getBean("team",Team.class);
		System.out.println(team);
		
		Channel channel = applicationContext.getBean("channel",Channel.class);
		System.out.println(channel);
		
		Phone phone = applicationContext.getBean("phone",Phone.class);
		System.out.println(phone);
		
		Hotel hotel = applicationContext.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		
		Institute institute = applicationContext.getBean("institute",Institute.class);
		System.out.println(institute);
		
		Juice juice = applicationContext.getBean("juice",Juice.class);
		System.out.println(juice);
		
		Company company = applicationContext.getBean("company",Company.class);
		System.out.println(company);
		
		Bar bar = applicationContext.getBean("bar",Bar.class);
		System.out.println(bar);
		
		Gun gun = applicationContext.getBean("gun",Gun.class);
		System.out.println(gun);
		
		Building building = applicationContext.getBean("building",Building.class);
		System.out.println(building);
	}

}
