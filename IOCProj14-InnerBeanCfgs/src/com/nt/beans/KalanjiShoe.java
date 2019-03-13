package com.nt.beans;

public class KalanjiShoe {
	private int size;
	private String color;
	private float price;
	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "KalanjiShoe [size=" + size + ", color=" + color + ", price=" + price + "]";
	}
	
	
	

}
