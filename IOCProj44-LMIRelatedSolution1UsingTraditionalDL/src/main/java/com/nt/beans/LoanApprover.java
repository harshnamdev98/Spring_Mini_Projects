package com.nt.beans;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoanApprover {
	 private String beanId;
	public LoanApprover(String beanId) {
		System.out.println("LoanApprover:1-param constructor");
	  this.beanId=beanId;
	}

	
   public String approveLoan(){
	   Calendar cal=null;
	   int  month=0;
	   ApplicationContext ctx=null;
	   LoanInfo info=null;
	   //create an additional IOC container
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	   //get Depedent class object
	   info=ctx.getBean("loanInfo",LoanInfo.class);
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
