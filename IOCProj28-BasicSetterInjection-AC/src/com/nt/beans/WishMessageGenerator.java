package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private static Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}

	public static void setDate(Date date1) {
		System.out.println("WMG::setDate(-)");
		date = date1;
	}
	
	public String generateWishMessage(String user){
		System.out.println("Date::"+date);
		int hour=0;
		//get current hour of the day
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
