package com.nt.beans;

public final class DTDC implements Courier{
	public  void deliver(int oid){
		System.out.println("DTDC::delivering order whose order id::"+oid);
	}

}
