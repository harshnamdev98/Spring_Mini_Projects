package com.nt.beans;

public class Bike {
	private String regNo;
	private String make;
	private String engineCC;
	private String modelName;
	private String trasmission;
	private String mileage;
	private String color;
	private long price;
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setTrasmission(String trasmission) {
		this.trasmission = trasmission;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", make=" + make + ", engineCC=" + engineCC + ", modelName=" + modelName
				+ ", trasmission=" + trasmission + ", mileage=" + mileage + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	

}
