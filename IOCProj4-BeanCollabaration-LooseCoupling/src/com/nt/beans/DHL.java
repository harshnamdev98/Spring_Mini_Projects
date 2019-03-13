package com.nt.beans;

public final class DHL implements Courier {

	@Override
	public void deliver(int oid) {
	   System.out.println("DHL:: "+oid+" order id order items delivering ");

	}

}
