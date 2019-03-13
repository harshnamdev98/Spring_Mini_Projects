package com.nt.beans;

import java.util.Date;
import java.util.List;

public class Company {
	private List<String> empNames;
	private List<Date> dates;

	public void setDates(List<Date> dates) {
		System.out.println(dates.getClass());
		this.dates = dates;
	}

	public void setEmpNames(List<String> empNames) {
		this.empNames = empNames;
	}

	@Override
	public String toString() {
		return "Company [empNames=" + empNames + ", dates=" + dates + "]";
	}

	
	
	

}
