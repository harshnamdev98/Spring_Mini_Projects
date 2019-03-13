package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	private Courier  courier;
	
	public Flipkart() {
		System.out.println("FlipKart:0-param constructor");
	}

	 //setter method for setter injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart:setCourier(-)");
		this.courier=courier;
	}
	
	public String shopping(String[] items){
		int billAmt=0;
		int oid=0;
		//shopping and billing logic
		billAmt=items.length*1000;
		//generate random order id
		oid=new Random().nextInt(100000);
		//use Courier to deliver product
		courier.deliver(oid);
		return  oid+" order id order items are"+Arrays.toString(items)+" and Bill Amount:: "+billAmt;
		
	}
	

}
