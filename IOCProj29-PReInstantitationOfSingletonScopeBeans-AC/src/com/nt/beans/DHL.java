package com.nt.beans;

public final class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL:0-param constructor");
	}

	@Override
	public void deliver(int oid) {
	   System.out.println("DHL:: "+oid+" order id order items delivering ");

	}

}
