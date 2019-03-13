package com.nt.beans;

public class LoanInfo {
    private int loanId;
	private String custName;
    private float amount;
    
    public LoanInfo(int loanId, String custName, float amount) {
    	System.out.println("LoanInfo:3-param constructor");
  		this.loanId = loanId;
  		this.custName = custName;
  		this.amount = amount;
  	}
    
    
    public int getLoanId() {
		return loanId;
	}

	public String getCustName() {
		return custName;
	}

	public float getAmount() {
		return amount;
	}

	
    
}
