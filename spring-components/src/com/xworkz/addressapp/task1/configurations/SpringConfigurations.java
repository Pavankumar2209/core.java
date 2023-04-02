package com.xworkz.addressapp.task1.configurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.addressapp.task1.channel.Channel;
import com.xworkz.addressapp.task1.clients.Company;
import com.xworkz.addressapp.task1.hotel.Hotel;
import com.xworkz.addressapp.task1.house.House;
import com.xworkz.addressapp.task1.institute.Institute;
import com.xworkz.addressapp.task1.juice.Juice;
import com.xworkz.addressapp.task1.phone.Phone;
import com.xworkz.addressapp.task1.team.Team;

@Configuration
public class SpringConfigurations {
	
	@Bean(value = "house")
	public House getHouse () {
		
		return new House();
	}
	
	@Bean(value = "team")
	public Team getTeam() {
		
		return new Team();
	}
	
	@Bean(value = "channel")
	public Channel getChannel() {
		
		return new Channel();
	}
	
	@Bean(value = "phone")
	public Phone getPhone() {
		
		return new Phone();
	}
	
	@Bean(value = "hotel")
	public Hotel getHotel() {
		
		return new Hotel();
		
	}
	
	@Bean(value = "institute")
	public Institute getInstitute() {
		
		return new Institute();
		}
	
	@Bean(value = "juice")
	public Juice getJuice() {
		
		return new Juice();
	}
	
	@Bean(value = "company")
	public Company getCompany() {
		
		return new Company();
	}
}
