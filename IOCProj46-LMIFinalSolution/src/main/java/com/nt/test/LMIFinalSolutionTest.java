package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.LoanApprover;

public class LMIFinalSolutionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanApprover approver=null,approver2=null;
	   //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	  //get Bean
		approver=ctx.getBean("loanApprover",LoanApprover.class);
		System.out.println(approver.getClass()+"  "+approver.getClass().getSuperclass());
		//invoke methods
		System.out.println(approver.approveLoan());
		System.out.println("..............................");
		approver2=ctx.getBean("loanApprover",LoanApprover.class);
		System.out.println(approver2.approveLoan());
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
