package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private  Date date;
	
	public WishMessageGenerator(Date date) {
		this.date=date;
		System.out.println("WishMessageGenerator::1-param constructor");
	}
	
	public void setDate(Date date){
		this.date=date;
		System.out.println("WishMessageGenerator::setDate(-) method");
	}

	
	
	public String generateWishMessage(String user){
		int hour=0;
		//get current hour of the day
		System.out.println("Injected Date value::"+date);
		hour=date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
		
	}
	

}
