package com.nt.beans;

import java.util.Date;

public class PersonDetails {
	private String name;
	private int age;
	private Date dob,doj,dom;
	
	public PersonDetails(String name, int age, Date dob, Date doj, Date dom) {
		System.out.println("5-param constructor");
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", age=" + age + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
	

}
