package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.ProffesionalCricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		ProffesionalCricketer crickter=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Taget class obj
		crickter=factory.getBean("cricketer",ProffesionalCricketer.class);
		//invoke methods
		crickter.fielding();
		crickter.bowling();
		crickter.batting();

	}

}
