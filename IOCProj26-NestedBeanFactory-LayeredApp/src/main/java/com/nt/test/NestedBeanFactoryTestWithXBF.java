package com.nt.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTestWithXBF {

	public static void main(String[] args) {
		BeanFactory pFactory=null,cFactory=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create Parent IOC container
		pFactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/business-beans.xml"));
		//create Child IOC container
		cFactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/presentation-beans.xml"),pFactory);
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
