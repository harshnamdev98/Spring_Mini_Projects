package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.singleton.PrinterUtil;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		PrinterUtil pu1=null,pu2=null;
		
		Constructor cons[]=null;
		try{
			pu1=PrinterUtil.getInstance();
		//create Object using Reflection api by accessing private constructor
		   //load class
		  Class c=Class.forName("com.nt.singleton.PrinterUtil");
		  //get Access to all the constructors
		  cons=c.getDeclaredConstructors();
		  //get Access to Private constructor
		  cons[0].setAccessible(true);
		  //create obj using the above accessed constructor
		  pu2=(PrinterUtil) cons[0].newInstance(null);
		  System.out.println(pu1.hashCode()+" "+pu2.hashCode());
		}
		catch(InstantiationException iae){
			iae.printStackTrace();
		}
		catch(Exception cnf){
			cnf.printStackTrace();
		}

	}

}
