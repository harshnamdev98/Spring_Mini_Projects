package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("main(-)");
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		Object obj=null;
		//Locate SpringBean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get Bean
		obj=factory.getBean("com.nt.beans.WishMessageGenerator");
		//typecasting
		generator=(WishMessageGenerator)obj;
		//invoke the method
		System.out.println("Result==="+generator.generateWishMessage("raja"));
		System.out.println("end of main(-)"); 
	}//main
}//class
