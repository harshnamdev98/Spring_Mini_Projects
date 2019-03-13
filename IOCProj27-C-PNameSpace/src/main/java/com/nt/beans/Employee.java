package com.nt.beans;

import java.util.Date;

public class Employee {
	private int empNo;
	private String empName;
	private  Date dob;
	private  Department dept;
	
	public Employee() {
		System.out.println("Employee:0-param constructor");
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", dob=" + dob + ", dept=" + dept + "]";
	}
	
	

}
