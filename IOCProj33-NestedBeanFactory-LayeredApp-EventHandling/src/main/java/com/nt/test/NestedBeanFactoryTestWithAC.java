package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTestWithAC {

	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create Parent IOC container
		pCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create Child IOC container
		cCtx=new ClassPathXmlApplicationContext(new String[]{"com/nt/cfgs/presentation-beans.xml"},pCtx);
		//Get Bean
		controller=cCtx.getBean("controller",MainController.class);
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
	((AbstractApplicationContext) pCtx).close();
	((AbstractApplicationContext) cCtx).close();
		
	}//main
}//class
