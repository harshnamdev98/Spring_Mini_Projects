package com.nt.beans;

import java.util.Calendar;

public class LoanApprover {
	private LoanInfo info;

	public LoanApprover(LoanInfo info) {
		System.out.println("LoanApprover:1-param constructor");
		this.info = info;
	}
	
   public String approveLoan(){
	   Calendar cal=null;
	   int  month=0;
	   //get System Date
	   cal=Calendar.getInstance();
	   //get current hour of the day
	   month=cal.get(Calendar.MONTH)+1;
	   //approve or reject loan
	   if( (month>=6 && month<=10) && info.getAmount()<=100000)
		   return "Loan Is Approved";
	   else
		   return "Loan Is Rejected";
   }//method
}//class
