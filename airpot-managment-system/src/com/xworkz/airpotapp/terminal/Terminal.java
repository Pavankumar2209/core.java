package com.xworkz.airpotapp.terminal;



//encapsulated class
public class Terminal {
	
	public Terminal() {
		
	}
	
	private String name;
	private int terminalNo;
	private String terminalType;
	
	public Terminal (String name, int terminalNo, String terminalType) {
		
		this.name = name;
		this.terminalNo= terminalNo;
		this.terminalType = terminalType;
	}

	
	//public getter and setter
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setTerminaNo(int terminaNo) {
		this.terminalNo = terminaNo;
	}
	public int getTerminalNo() {
		return terminalNo;
	}
	
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	public String getTerminalType() {
		return terminalType;
	}
}
