package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.PersonDetails;

public class NullInjectionTest {

	public static void main(String[] args) {
	   BeanFactory factory=null;
	   PersonDetails details=null;
		//create IOC container
	   factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	   ///get Bean
	   details=factory.getBean("pDetails",PersonDetails.class);
	   System.out.println(details);
	}//main
}//class
