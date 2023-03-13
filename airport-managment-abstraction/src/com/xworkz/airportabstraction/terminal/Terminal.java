package com.xworkz.airportabstraction.terminal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import com.xworkz.airportabstraction.airport.Airport_Abstraction;


@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Terminal {
	
		
	private String name;
	private Integer terminalNo;
	private String terminalType;
	
	
	//toString method used to get reference variable 
	@Override
	public String toString() {
		return "Terminal -(Name = "+this.name+",TerminalNo = "+this.terminalNo+", Terminal Type ="+this.terminalType+")";
	}

	
	

}
