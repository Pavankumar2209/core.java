package com.xworkz.addressapp.task1.channel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString

public class Channel {
	
	@Value("Star Sports kannada")
	private String channelName;
	
	@Autowired
	private Viewers viewers ;

}
