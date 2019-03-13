package com.nt.beans;

public final class FirstFlight implements Courier {
	
	public FirstFlight() {
		System.out.println("FirstFlight:0-param constructor");
	}
	
	public  void deliver(int oid){
		System.out.println("FirstFlight::delivering order whose order id::"+oid);
	}

}
