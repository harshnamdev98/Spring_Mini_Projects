package com.nt.beans;

public class ComputerSystem {
	private int sysId;
	private String labName;
	
	private ComputerSystem() {
		System.out.println("Private 0-param constructor");
	}
	
	public void setSysId(int sysId) {
		this.sysId = sysId;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "ComputerSystem [sysId=" + sysId + ", labName=" + labName + "]";
	}
	
	
	

}
