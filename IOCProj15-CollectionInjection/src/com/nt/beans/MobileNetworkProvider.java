package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class MobileNetworkProvider {
	private Set<Long> fancyNumbers;
	private Set<Date>  dates;

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

	public void setFancyNumbers(Set<Long> fancyNumbers) {
		System.out.println(fancyNumbers.getClass());
		this.fancyNumbers = fancyNumbers;
	}

	@Override
	public String toString() {
		return "MobileNetworkProvider [fancyNumbers=" + fancyNumbers + ", dates=" + dates + "]";
	}


	
	

}
