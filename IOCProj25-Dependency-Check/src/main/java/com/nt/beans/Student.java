package com.nt.beans;

import java.util.Date;

public class Student {
	private int sno;
	private String sname;
	private String address;
	private Course course;
	private Date  dob;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + ", course=" + course + ", dob="
				+ dob + "]";
	}
	
	
	
	

}
