package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//create IOC container
		//ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean
		generator=ctx.getBean("wish",WishMessageGenerator.class);
		//invoke the method
		System.out.println("Result==="+generator.generateWishMessage("raja"));
		System.out.println("end of main(-)"); 
	}//main
}//class
