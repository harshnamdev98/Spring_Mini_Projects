package com.nt.singleton;

public class PrinterUtil {
	private static PrinterUtil instance;
	private static boolean instantiated;
	
	private PrinterUtil()throws Exception {
	  System.out.println("0-param constructor");
	  if(instantiated)
		  throw new Exception("Object already created");
	  else
		  instantiated=true;
	}
	
	public static PrinterUtil getInstance()throws Exception{
		if(instance==null)
			instance=new PrinterUtil();
		return instance;
		
	}
	
	public  void print(){
		System.out.println("Printing on paper .....");
	}

}
