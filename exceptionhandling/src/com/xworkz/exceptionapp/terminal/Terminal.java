package com.xworkz.exceptionapp.terminal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
public class Terminal {
	
		
	private String name;
	private int terminalNo;
	private String terminalType;
	
	
	//toString method used to get reference variable 
	@Override
	public String toString() {
		return "Terminal -(Name = "+this.name+",TerminalNo = "+this.terminalNo+", Terminal Type ="+this.terminalType+")";
	}

	
	

}
