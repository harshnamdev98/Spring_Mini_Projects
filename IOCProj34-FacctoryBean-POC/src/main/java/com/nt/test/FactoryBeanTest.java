package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Alaram;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Alaram alaram=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		alaram=ctx.getBean("alaram",Alaram.class);
		System.out.println(alaram.remainder());
		//close contianer
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
