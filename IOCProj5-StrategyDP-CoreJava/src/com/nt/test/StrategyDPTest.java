package com.nt.test;

import com.nt.comp.Viechle;
import com.nt.factory.ViechleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Viechle viechle=null,viechle1=null,viechle2=null;
		//get Viechle obj from Factory
		viechle=(Viechle)ViechleFactory.getInstance("viechle1","petrol");
		
		viechle.move();
		viechle.park();
		System.out.println("............................");
		viechle1=(Viechle)ViechleFactory.getInstance("viechle","petrol");
		viechle1.move();
		viechle1.park();

		System.out.println(viechle.hashCode()+"   "+viechle1.hashCode());
		
	}
}
