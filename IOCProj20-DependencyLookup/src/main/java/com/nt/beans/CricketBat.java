package com.nt.beans;

import java.util.Random;

public class CricketBat {
	
	
	public CricketBat() {
		System.out.println("CricketBat:0-param constructor");
	}
	
	public  int  hitRuns(){
		return new Random().nextInt(300);
	}

}
