package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class University {
	private Map<String,String> facultySubjects;
	private Map<String,Date> impDates;
	private Map<Date,Date> dates;
	
	public Map<String, Date> getImpDates() {
		return impDates;
	}

	public void setImpDates(Map<String, Date> impDates) {
		this.impDates = impDates;
	}

	

	public void setDates(Map<Date, Date> dates) {
		this.dates = dates;
	}

	

	public void setFacultySubjects(Map<String, String> facultySubjects) {
		System.out.println(facultySubjects.getClass());
		this.facultySubjects = facultySubjects;
	}

	@Override
	public String toString() {
		return "University [facultySubjects=" + facultySubjects + ", impDates=" + impDates + ", dates=" + dates + "]";
	}

	
	

}
