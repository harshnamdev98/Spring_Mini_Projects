package com.nt.beans;

public class Course {
	private String name;
	private int duration;
	private String location;

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", location=" + location + "]";
	}
	
	

}
