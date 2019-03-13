package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Viechle;

public class DepedencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target class obj
		viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.move();
		viechle.startEntertainment();
		viechle.soundHorn();
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
