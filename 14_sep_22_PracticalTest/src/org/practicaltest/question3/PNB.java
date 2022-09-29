package org.practicaltest.question3;

abstract public class PNB {
	String bankName;
	int bankid;
	abstract void Policy(); 
	 
	
	public PNB(String bankName) {
		super();
		this.bankName = bankName;
	}

	public PNB(String bankName,int bankid) {
		super();
		this.bankName = bankName;
		this.bankid = bankid;
	}
	
	public void bankInfo(String bankName) {
		this.bankName = bankName;
		
	}
	
	public void bankInfo(String bankName,int bankid) {
		this.bankName = bankName;
		this.bankid = bankid;
	}
	
	

}