package com.nt.service;

import com.nt.extComp.ICCScoreComp;

public class EspnFindScoreServiceImpl implements EspnFindScoreService {

	private ICCScoreComp extComp;

	public EspnFindScoreServiceImpl(ICCScoreComp extComp) {
		this.extComp = extComp;
	}

	public String findScore(int mid) throws IllegalArgumentException {
		String score=null;
		//use the injected extenal comp ref
		score=extComp.getScore(mid);
		return score;
	}

}
