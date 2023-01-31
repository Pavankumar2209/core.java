package com.xworkz.encapsulationconcept.termina1;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Terminal1 {
	
	public Terminal1() {

	}
	
	
	private String name;
	private int terminalNo;
	private String terminalType;
	
	public Terminal1 (String name, int terminalNo, String terminalType) {
		
		this.name = name;
		this.terminalNo= terminalNo;
		this.terminalType = terminalType;
		
	}
	
	//Getter and setter Methods
	
	/*public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setTerminalNo(int terminalNo) {
		this.terminalNo = terminalNo;
	}
	public int getTerminalNo() {
		return terminalNo;
	}
	
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getTerminalType() {
		return terminalType;
	}*/
	

}
