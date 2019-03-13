package com.nt.listener;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class PerformanceEvaluatorListener implements ApplicationListener {
	public PerformanceEvaluatorListener() {
		System.out.println("PEL::0-param constructor");
	}
   private long start=0,end=0;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("PerformanceEvaluatorListener.onApplicationEvent()");
		if(event.toString().indexOf("Refreshed")!=-1)
		  start=System.currentTimeMillis();
		else if(event.toString().indexOf("Closed")!=-1){
			end=System.currentTimeMillis();
			System.out.println("total time::"+(end-start)+"ms");
		}
		
	}
}
