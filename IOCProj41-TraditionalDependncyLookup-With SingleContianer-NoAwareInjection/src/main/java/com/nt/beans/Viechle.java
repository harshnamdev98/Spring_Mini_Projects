package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle {
	private String beanId;
	
	public Viechle(String beanId) {
     System.out.println("Viechle:1 -param construtor");	
		this.beanId = beanId;
	}

	
	
	public void startEntertainment(){
		System.out.println("This viechle equipped with Sony Music Player");
	}
	
	public void  soundHorn(){
		System.out.println("This viechle equipped with Skoda Horn");
	}
	
	public void move(ApplicationContext ctx){
		Engine engg=null;
		//get Bean
		engg=ctx.getBean(beanId,Engine.class);
		//use engg obj
		engg.start();
		
		System.out.println("Viechle is moving.....");
		engg.stop();
		System.out.println("Viechile is stopped");
	}//method

}
