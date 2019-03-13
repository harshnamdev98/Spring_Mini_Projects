package com.nt.beans;

public class DecothlanStore {
	private KalanjiShoe shoe;

	public void setShoe(KalanjiShoe shoe) {
		this.shoe = shoe;
	}
	
	public void sale(){
	   if(shoe!=null){
		   System.out.println("Decolthan store-->"+shoe+" is kept sale having 10% discount");
	   }
	}
	

}
