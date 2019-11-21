package com.lti.model;

import java.time.LocalDate;

import javax.persistence.OneToOne;

public class EmiTransaction {


	private LocalDate month;
	private double balanceAmt;
	private double emiAmt;
	private LocalDate paidTimestamp;
	
	@OneToOne(mappedBy="emiTransaction") //Bidirectional reln inverse side
	private UserDetail userDetail;
	
	@OneToOne(mappedBy="emiTransaction") //Bidirectional reln inverse side
	private ApplicationRequest applicationRequest;
	
	
	public EmiTransaction() {
		super();
		
	}


	public EmiTransaction(LocalDate month, double balanceAmt, double emiAmt, LocalDate paidTimestamp,
			UserDetail userDetail, ApplicationRequest applicationRequest) {
		super();
		this.month = month;
		this.balanceAmt = balanceAmt;
		this.emiAmt = emiAmt;
		this.paidTimestamp = paidTimestamp;
		this.userDetail = userDetail;
		this.applicationRequest = applicationRequest;
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


	public UserDetail getUserDetail() {
		return userDetail;
	}


	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}


	public ApplicationRequest getApplicationRequest() {
		return applicationRequest;
	}


	public void setApplicationRequest(ApplicationRequest applicationRequest) {
		this.applicationRequest = applicationRequest;
	}


	@Override
	public String toString() {
		return "EmiTransaction [month=" + month + ", balanceAmt=" + balanceAmt + ", emiAmt=" + emiAmt
				+ ", paidTimestamp=" + paidTimestamp + ", userDetail=" + userDetail + ", applicationRequest="
				+ applicationRequest + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	
}
