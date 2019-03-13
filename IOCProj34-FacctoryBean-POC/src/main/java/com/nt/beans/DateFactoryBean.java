package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	private int year;
	private int month;
	private int day;

	public DateFactoryBean(int year, int month, int day) {
		System.out.println("DateFactoryBean:3-param constructor");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean:getObject()");
		return new Date(year-1900,month-1,day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean:getObjectType()");
		return Date.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean:isSingleton");
		return true;
	}

}
