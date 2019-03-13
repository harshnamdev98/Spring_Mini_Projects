package com.nt.extComp;

public class ICCScoreCompImpl implements ICCScoreComp {

	public String getScore(int mid) throws IllegalArgumentException {
		if(mid==1001)
		    return "IND vs PAK -->Ind::455/6";
		else if(mid==1002)
			return "AUS vs ENG --> AUS::233/5";
		else if(mid==1003)
			return "SL  Vs BAN -->  BAN ::112/9";
		else
			throw new IllegalArgumentException("Invalid MatchId");
	}

}
