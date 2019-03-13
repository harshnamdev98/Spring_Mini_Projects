package com.nt.beans;

public final class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:0-param constuctor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine(VTIS)::started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine(VTIS)::stopped");

	}

}
