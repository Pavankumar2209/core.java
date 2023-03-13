package com.xworkz.collectionsapp.airport_managment_system.dto ;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class TerminalDTO implements Serializable {
	
		
	private String name;
	private Integer terminalNo;
	private String terminalType;
	
	
	//toString method used to get reference variable 
	@Override
	public String toString() {
		return "Terminal -(Name = "+this.name+",TerminalNo = "+this.terminalNo+", Terminal Type ="+this.terminalType+")";
	}

	
	

}
