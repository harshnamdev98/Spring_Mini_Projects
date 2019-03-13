package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class clazz=null;
		Calendar cal=null;
		String st1=null,st2=null;
		//create Logical empty IOC container
		factory=new DefaultListableBeanFactory();
		//create Reader having IOC container
		reader=new XmlBeanDefinitionReader(factory);
		//reader reads Xml file data and passes its InMemory MetaData IOC container
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Beans
		clazz=factory.getBean("clazz",Class.class);
		System.out.println("clazz data::"+clazz+" clazz class name::"+clazz.getClass().getName());
		System.out.println("...............................");
		cal=factory.getBean("cal",Calendar.class);
		System.out.println("calendar obj data::"+cal+" cal obj class name"+cal.getClass().getName());
		System.out.println("............................");
		st1=factory.getBean("s2",String.class);
		System.out.println("st1 data==>"+st1+" st1 class ::"+st1.getClass());
		System.out.println("............................");
		st2=factory.getBean("s3",String.class);
		System.out.println("st2 data==>"+st2+" st2 class::"+st2.getClass());
	}//main
}//class
