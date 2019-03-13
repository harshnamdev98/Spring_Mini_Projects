package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DTDC;
import com.nt.beans.Flipkart;

public class LooseCouplingTestWithAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		DTDC dtdc=null;
	  //create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Target class obj
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the method
		System.out.println(fpkt.shopping(new String[]{"Big Laddu","Big Murthi","puja items","prasad items","decoration items"}));
		
		dtdc=ctx.getBean("dtdc",DTDC.class);
		

	}//main
}//class
