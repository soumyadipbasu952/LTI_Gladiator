package com.lti.model;

import java.time.LocalDate;

public class EmiTransaction {


	private String applicationId;
	private String userId;
	private LocalDate month;
	private double balanceAmt;
	private double emiAmt;
	private LocalDate paidTimestamp;
	
	
	public EmiTransaction() {
		super();
		
	}


	public EmiTransaction(String applicationId, String userId, LocalDate month, double balanceAmt, double emiAmt,
			LocalDate paidTimestamp) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.month = month;
		this.balanceAmt = balanceAmt;
		this.emiAmt = emiAmt;
		this.paidTimestamp = paidTimestamp;
	}


	public String getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public LocalDate getMonth() {
		return month;
	}


	public void setMonth(LocalDate month) {
		this.month = month;
	}


	public double getBalanceAmt() {
		return balanceAmt;
	}


	public void setBalanceAmt(double balanceAmt) {
		this.balanceAmt = balanceAmt;
	}


	public double getEmiAmt() {
		return emiAmt;
	}


	public void setEmiAmt(double emiAmt) {
		this.emiAmt = emiAmt;
	}


	public LocalDate getPaidTimestamp() {
		return paidTimestamp;
	}


	public void setPaidTimestamp(LocalDate paidTimestamp) {
		this.paidTimestamp = paidTimestamp;
	}


	@Override
	public String toString() {
		return "EmiTransaction [applicationId=" + applicationId + ", userId=" + userId + ", balanceAmt=" + balanceAmt
				+ ", emiAmt=" + emiAmt + "]";
	}
	
	
	
	
}
