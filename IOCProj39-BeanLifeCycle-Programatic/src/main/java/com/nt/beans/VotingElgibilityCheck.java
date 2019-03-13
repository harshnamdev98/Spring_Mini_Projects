package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VotingElgibilityCheck implements InitializingBean,DisposableBean {
	private String name;
	private int age;
	private String addrs;
	public VotingElgibilityCheck() {
		System.out.println("VotingElgibilityCheck.VotingElgibilityCheck()");
	}
	public void setName(String name) {
		System.out.println("VotingElgibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotingElgibilityCheck.setAge()");
		this.age = age;
	}
	public void setAddrs(String addrs) {
		System.out.println("VotingElgibilityCheck.setAddrs()");
		this.addrs = addrs;
	}
	
	//custom init method
	public void myInit(){
		System.out.println("VotingElgibilityCheck.myInit()");
		if(age<=0 || name==null )
			throw new IllegalArgumentException("invalid name,age values");
		
	}
	
	public String checkVotingElgibity(){
		System.out.println("VotingElgibilityCheck.checkVotingElgibity()");
		if(age<18)
			return "Mr/Miss."+name+" u r not elgible for voting";
		else
			return "Mr/Miss."+name+" u r elgible for voting";
		
	}//method
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VotingElgibilityCheck.afterPropertiesSet()");
		if(name==null || age<=0)
			throw new IllegalArgumentException("Invalid name,age values");
		
	}
	
	//custom destroy method
	public void myDestroy(){
		System.out.println("VotingElgibilityCheck.myDestroy()");
		name=null;
		age=0;
		addrs=null;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("VotingElgibilityCheck.destroy()");
		name=null;
		age=0;
		addrs=null;
	}
	
	
}//class
