package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Company;
import com.nt.beans.FruitShop;
import com.nt.beans.MobileNetworkProvider;
import com.nt.beans.Student;
import com.nt.beans.University;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null;
		Company comp=null;
		MobileNetworkProvider provider=null;
		University university=null;
		FruitShop shop=null;
		//create IOC Container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		st=factory.getBean("st",Student.class);
		System.out.println(st);
		
		System.out.println("......................");
        comp=factory.getBean("comp",Company.class);
        System.out.println(comp);
        
        System.out.println(".................");
        provider=factory.getBean("mnp",MobileNetworkProvider.class);
        System.out.println(provider);
        
        System.out.println("................");
        university=factory.getBean("university",University.class);
        System.out.println(university);
       
        System.out.println("..........................");
        shop=factory.getBean("fruitStore",FruitShop.class);
        System.out.println(shop);
        
	}

}
