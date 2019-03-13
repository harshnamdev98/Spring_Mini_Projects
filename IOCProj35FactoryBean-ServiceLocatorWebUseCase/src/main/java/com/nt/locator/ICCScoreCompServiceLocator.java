package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.extComp.ICCScoreComp;
import com.nt.extComp.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator implements FactoryBean<ICCScoreComp> {
	private String jndiName;
	private Map<String,ICCScoreComp> cacheMap=new HashMap();

	public ICCScoreCompServiceLocator(String jndiName) {
		this.jndiName = jndiName;
	}

	
	
	public ICCScoreComp getObject() throws Exception {
		ICCScoreComp iccComp=null;
		if(!cacheMap.containsKey(jndiName)){
		  iccComp=new ICCScoreCompImpl(); //Actually we should it through jndi lookup operation
		  cacheMap.put(jndiName,iccComp);
		}
		return cacheMap.get(jndiName);
		  
	}

	public Class<?> getObjectType() {
		return ICCScoreComp.class;
	}
	
	public boolean isSingleton() {
		return true;
	}
	

}
