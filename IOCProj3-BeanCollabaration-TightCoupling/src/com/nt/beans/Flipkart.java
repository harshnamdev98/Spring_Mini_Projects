package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private DTDC  dtdc;

	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	
	public String shopping(String[] items){
		int billAmt=0;
		int oid=0;
		//shopping and billing logic
		billAmt=items.length*1000;
		//generate random order id
		oid=new Random().nextInt(100000);
		//use Courier to deliver product
		dtdc.deliver(oid);
		return  oid+" order id order items are"+Arrays.toString(items)+" and Bill Amount:: "+billAmt;
		
	}
	

}
