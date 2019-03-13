package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ProffesionalCricketer {
	private String beanId;
	
	public ProffesionalCricketer(String beanId) {
		System.out.println("ProffesinalCricketer:1-param constructor");
		this.beanId = beanId;
	}

	public  void bowling(){
		System.out.println("PoffesionalCricketer:bowling()");
	}
	
	public  void fielding(){
		System.out.println("PoffesionalCricketer:fielding()");
	}
	
	public void batting(){
		System.out.println("batting method");
		BeanFactory factory=null;
		CricketBat bat=null;
		int runs=0;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		System.out.println("IOC container is created for DL");
		//get Dependent class obj (Dependency lookup )
		bat=factory.getBean(beanId,CricketBat.class);
		System.out.println("Dependent class obj is gathered");		
		//use Dependent class obj
		runs=bat.hitRuns();
		System.out.println("Cricker is batting and scored "+runs +" runs");
		
	}
	
	

}
