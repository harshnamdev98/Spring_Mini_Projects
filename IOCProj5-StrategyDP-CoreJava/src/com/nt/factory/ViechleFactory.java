package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Viechle;

public class ViechleFactory {
	private static Map<String,Object> cacheMap=new HashMap();
	
	public static Object getInstance(String nickName,String engineType){
		 Engine engg=null;
		 Viechle viechle=null;
		if(!cacheMap.containsKey(nickName)){
			if(nickName.equals("dEngg")){
				engg=new DieselEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("pEngg")){
				engg=new PetrolEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("cEngg")){
				engg=new CNGEngine();
				cacheMap.put(nickName,engg);
			}
			else if(nickName.equals("viechle")){
				viechle=new Viechle();
				if(engineType.equals("diesel")){
				   engg=new DieselEngine();
				   viechle.setEngg(engg);
				}
				else if(engineType.equals("petrol")){
					   engg=new PetrolEngine();
					   viechle.setEngg(engg);
				}
				else if(engineType.equals("cng")){
					   engg=new CNGEngine();
					   viechle.setEngg(engg);
				}
				else{
					throw new IllegalArgumentException("inavalid Engine type");
				}
				cacheMap.put(nickName,viechle);
			}
			else{
				throw new IllegalArgumentException("Invalid NickName");
			}
		}//if
			return cacheMap.get(nickName);
		
	}//getInstance()
}//class
