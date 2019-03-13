package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.extComp.ICCScoreComp;
import com.nt.extComp.ICCScoreCompImpl;

public abstract class ICCScoreCompServiceLocator{
	private static Map<String,ICCScoreComp> cacheMap=new HashMap();

	
	
	public static ICCScoreComp getIccExtComp(String jndiName) throws Exception {
		ICCScoreComp iccComp=null;
		if(!cacheMap.containsKey(jndiName)){
		  iccComp=new ICCScoreCompImpl(); //Actually we should it through jndi lookup operation
		  cacheMap.put(jndiName,iccComp);
		}
		return cacheMap.get(jndiName);
		  
	}

	
	

}
