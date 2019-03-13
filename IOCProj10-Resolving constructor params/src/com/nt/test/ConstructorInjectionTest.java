package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Customer;
import com.nt.beans.Employee;
import com.nt.beans.Marks;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Employee emp=null;
		Marks mk=null;
		Customer cust=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		emp=factory.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println(".....................");
		//get Bean
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println(".....................");
		cust=factory.getBean("cust",Customer.class);
		System.out.println(cust);
		

	}

}
