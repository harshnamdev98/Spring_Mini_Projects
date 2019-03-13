package com.nt.beans;

import java.util.Date;

public class Alaram {
	private  Date  date;

	public Alaram(Date date) {
		this.date = date;
	}
	
	public String remainder(){
/*		if(new Date().compareTo(date)==0)
			return "alarm for spring calss";
		else 
			return null;

*/
		Date sysDate=null;
		//get System Date
		sysDate=new Date();
		if(sysDate.getYear()==date.getYear() && sysDate.getMonth()==date.getMonth() && sysDate.getDate()==date.getDate())
			return "Remainder for birthday wishes to Mother";
		else
			return "No Remainder today";
	}

}
