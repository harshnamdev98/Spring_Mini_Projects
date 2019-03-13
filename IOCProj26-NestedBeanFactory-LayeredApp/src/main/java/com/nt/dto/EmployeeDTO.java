package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int sno;
	
	private int empNo;
	private String empName;
	private String empDesg;
	private int empSalary;
	private int deptNo;
	private int mgrNo;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesg() {
		return empDesg;
	}
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getMgrNo() {
		return mgrNo;
	}
	public void setMgrNo(int mgrNo) {
		this.mgrNo = mgrNo;
	}
	
	@Override
	public String toString() {
		return "EmployeeDTO [sno=" + sno + ", empNo=" + empNo + ", empName=" + empName + ", empDesg=" + empDesg
				+ ", empSalary=" + empSalary + ", deptNo=" + deptNo + ", mgrNo=" + mgrNo + "]";
	}

}
