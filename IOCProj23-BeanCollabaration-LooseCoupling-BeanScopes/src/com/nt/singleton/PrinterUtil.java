package com.nt.singleton;

public class PrinterUtil {
	private static PrinterUtil instance;
	
	private PrinterUtil(){
	 System.out.println("PrinterUtil:0-param constructor");	
	}
	
	public  static  PrinterUtil getInstance(){
		 if(instance==null)
			 instance=new PrinterUtil();
		 return instance;
	}
	
	public void print(){
		System.out.println("Taking print out of the page...");
	}

}
