package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		MainController controller=null;
		Scanner sc=null;
		String no=null,name=null,m1=null,m2=null,m3=null;
		StudentVO vo=null;
		//create IOc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Controller
		controller= factory.getBean("controller",MainController.class);
		//read inputs from enduser
		sc=new Scanner(System.in);
		System.out.println("Enter sno::");
		no=sc.next();
		System.out.println("Enter sname::");
		name=sc.next();
		System.out.println("Enter m1::");
		m1=sc.next();
		System.out.println("Enter m2::");
		m2=sc.next();
		System.out.println("Enter m3::");
		m3=sc.next();
		//create StudentVO class obj
		vo=new StudentVO();
		vo.setSno(no);
		vo.setSname(name);
		vo.setM1(m1);vo.setM2(m2); vo.setM3(m3);
		
		//invoking method
		try{
			System.out.println("Result::::"+controller.process(vo));
		}
		catch(Exception e){
			System.out.println("Internal Problem::"+e.getMessage());
		}

	}//main
}//class
