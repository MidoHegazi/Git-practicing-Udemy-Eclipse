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

	public void printName() {
		System.out.println(name);
	}
	
	// Comment "TODO"
	/**Mido try to implement something that goes through**/

}
