package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Viechle;

public class StrategyDPTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Viechle viechle=null,viechle1=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Viechle obj
		viechle=factory.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.move();
		viechle.park();
		System.out.println("................");
		viechle1=factory.getBean("viechle",Viechle.class);
		//invoke methods
		viechle1.move();
		viechle1.park();
		System.out.println(viechle.hashCode()+"  "+viechle1.hashCode());
		}
}
