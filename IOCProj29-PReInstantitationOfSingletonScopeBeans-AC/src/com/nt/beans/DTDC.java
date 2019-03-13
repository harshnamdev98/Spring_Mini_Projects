package com.nt.beans;

public final class DTDC implements Courier{
	
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}
	
	public  void deliver(int oid){
		System.out.println("DTDC::delivering order whose order id::"+oid);
	}

}
