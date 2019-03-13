package com.nt.beans;

import java.util.Date;

public class Department {
	private int deptNo;
	private String deptName;
	private Date dos;
	
	public Department(int deptNo, String deptName, Date dos) {
	System.out.println("Department:3-param constructor");
	
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.dos = dos;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", dos=" + dos + "]";
	}
	
	

}
