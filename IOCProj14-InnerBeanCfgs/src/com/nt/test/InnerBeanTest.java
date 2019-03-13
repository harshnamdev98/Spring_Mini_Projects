package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.DecothlanStore;
import com.nt.beans.KalanjiShoe;

public class InnerBeanTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		DecothlanStore store=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//getBean
		store=factory.getBean("dStore",DecothlanStore.class);
		 factory.getBean("kShoe",KalanjiShoe.class);
		//invoke method
		store.sale();
	}//main
}//class
