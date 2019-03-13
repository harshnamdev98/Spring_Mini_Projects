package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;
import com.nt.singleton.PrinterUtil;

public class SingletonTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PrinterUtil p1=null,p2=null,p3=null,p4=null,p5=null;
		
	  //create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	  //get   Bean class obj
		p1=factory.getBean("pu1",PrinterUtil.class);
		p2=factory.getBean("pu1",PrinterUtil.class);
		p3=factory.getBean("pu2",PrinterUtil.class);
		p4=factory.getBean("pu3",PrinterUtil.class);
		p5=factory.getBean("pu3",PrinterUtil.class);
		System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode()+" "+p4.hashCode()+" "+p5.hashCode());
		System.out.println(".....................");
		
		

	}//main
}//class
