package com.nt.beans;

public final class BlueDart implements Courier{
	public  void deliver(int oid){
		System.out.println("BlueDart::delivering order whose order id::"+oid);
	}

}
