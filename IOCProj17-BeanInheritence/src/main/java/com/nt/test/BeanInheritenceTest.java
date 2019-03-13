package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
         BeanFactory factory=null;
         Bike bike1=null,bike2=null,bike3=null;
		//create IOC container
         factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
         //get Bean
         bike1=factory.getBean("bike1",Bike.class);
         System.out.println(bike1);
         System.out.println("......");     
         bike2=factory.getBean("bike2",Bike.class);
         System.out.println(bike2);
         System.out.println("......"); 
         bike3=factory.getBean("baseBike",Bike.class);
         System.out.println(bike3);
	}//main
}//class
