package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingElgibilityCheck;

public class BeanLifeCycleTest_Declarative {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VotingElgibilityCheck check=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	    //get Bean
		check=ctx.getBean("vec",VotingElgibilityCheck.class);
		//invoke method
		System.out.println(check.checkVotingElgibity());
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}

}
