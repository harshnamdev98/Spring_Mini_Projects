package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTestWithDLBF {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create Parent IOC container
		pFactory=new DefaultListableBeanFactory();
		//Load and read xml file cfgs
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		//create Child IOC container
		cFactory=new DefaultListableBeanFactory(pFactory);
		//Load and read xml file cfgs
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//Get Bean
		controller=cFactory.getBean("controller",MainController.class);
		//invoke method
		try{
			listDTO=controller.searchEmpsByDesgs("CLERK","SALESMAN","MANAGER");
			//display details
			listDTO.forEach(dto->{
				System.out.println(dto);
			});
		}//try
		catch(Exception se){
			se.printStackTrace();
		}
		

	}

}
