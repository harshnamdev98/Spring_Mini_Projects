package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.ComputerSystem;

public class BeanAliasTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		ComputerSystem cs1=null,cs2=null,cs3=null,cs4=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Beans
		cs1=factory.getBean("computerSystem",ComputerSystem.class);
		System.out.println(cs1);
		System.out.println("..................");
		cs2=factory.getBean("pc",ComputerSystem.class);
		System.out.println(cs2);
		System.out.println("..................");
		cs3=factory.getBean("sys",ComputerSystem.class);
		System.out.println(cs3);
		System.out.println("..................");
		cs4=factory.getBean("system",ComputerSystem.class);
		System.out.println(cs4);
	}
}
