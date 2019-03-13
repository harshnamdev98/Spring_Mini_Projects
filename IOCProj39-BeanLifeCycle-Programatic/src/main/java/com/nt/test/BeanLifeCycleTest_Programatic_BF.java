package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.VotingElgibilityCheck;

public class BeanLifeCycleTest_Programatic_BF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		VotingElgibilityCheck check=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    //get Bean
		check=factory.getBean("vec",VotingElgibilityCheck.class);
		//invoke method
		System.out.println(check.checkVotingElgibity());
		//close container
		//factory.destroySingletons();
	}

}
