package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class LooseCouplingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null,fpkt1=null,fpkt2=null;
	  //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	  //get Target class obj
		fpkt=factory.getBean("fpkt",Flipkart.class);
		fpkt1=factory.getBean("fpkt",Flipkart.class);
		System.out.println("fpkt==fpkt1?"+(fpkt==fpkt1));
		System.out.println(fpkt.hashCode()+" "+fpkt1.hashCode());
		//invoke the method
		System.out.println(fpkt.shopping(new String[]{"Big Laddu","Big Murthi","puja items","prasad items","decoration items"}));
		
		fpkt2=factory.getBean("osw",Flipkart.class);
		System.out.println(fpkt2.hashCode());
		
		
		

	}//main
}//class
