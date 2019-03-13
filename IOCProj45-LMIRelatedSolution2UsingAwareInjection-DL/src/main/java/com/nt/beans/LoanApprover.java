package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoanApprover implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;

	}

	public LoanApprover(String beanId) {
		System.out.println("LoanApprover:1-param constructor");
		this.beanId = beanId;
	}

	public String approveLoan() {
		Calendar cal = null;
		int month = 0;
		LoanInfo info = null;
		// get Depedent class object
		info = ctx.getBean(beanId, LoanInfo.class);
		// get System Date
		cal = Calendar.getInstance();
		// get current hour of the day
		month = cal.get(Calendar.MONTH) + 1;
		// approve or reject loan
		if ((month >= 6 && month <= 10) && info.getAmount() <= 100000)
			return "Loan Is Approved";
		else
			return "Loan Is Rejected";
	}// method

	

}// class
