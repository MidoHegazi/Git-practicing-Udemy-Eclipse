package com.midohegazi.gitpracticing;

public class Company {
	
	private String name;
	private String address;
	private String pIva;
	
	public String getName() {
		return this.name;
	}

	public String getAddress(){
	   return this.address; 
	}

	
	public String getPartitaIva() {
		return this.pIva;
	}
	
	public String getNameAndAddress() {
		return "Name : "+this.name +"Address : "+ this.address; 

	}
}
