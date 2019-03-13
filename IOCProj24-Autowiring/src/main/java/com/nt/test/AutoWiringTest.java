package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TravelAgent;

public class AutoWiringTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		TravelAgent agent=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Reader
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
         agent=(TravelAgent)factory.getBean("agent");
        //invoke method
         agent.executePlan();
	}

}
