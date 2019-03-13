package com.nt.beans;

public final class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine:0-param constuctor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine(DDIS)::started");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine(DDIS)::stopped");

	}

}
