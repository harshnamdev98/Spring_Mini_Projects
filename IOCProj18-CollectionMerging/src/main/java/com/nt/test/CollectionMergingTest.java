package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggCourse course=null;
		//create IOCcontainer
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		course=factory.getBean("eceEngg1stSem",EnggCourse.class);
		System.out.println(course);

	}

}
