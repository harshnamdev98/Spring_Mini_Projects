package com.nt.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

public class RealtimeDITestWithAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MainController controller=null;
		Scanner sc=null;
		String name=null,m1=null,m2=null,m3=null;
		StudentVO vo=null;
		//create IOc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Controller
		controller= ctx.getBean("controller",MainController.class);
		//read inputs from enduser
		sc=new Scanner(System.in);
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
