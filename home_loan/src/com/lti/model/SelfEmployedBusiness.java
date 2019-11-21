package com.lti.model;

import javax.persistence.OneToOne;

public class SelfEmployedBusiness {

	
	private double patAsPerLatestItr;
	private double depreciationLast3Avg;
	private double existingEmi;

	
	@OneToOne(mappedBy="selfEmployedBusiness")
	private UserDetail userDetail;
	
	
	
	@OneToOne(mappedBy="selfEmployedBusiness")
	private IncomeDetail incomeDetail;
	
	
	
	public SelfEmployedBusiness() {
		super();
		
	}



	public SelfEmployedBusiness(double patAsPerLatestItr, double depreciationLast3Avg, double existingEmi,
			UserDetail userDetail, IncomeDetail incomeDetail) {
		super();
		this.patAsPerLatestItr = patAsPerLatestItr;
		this.depreciationLast3Avg = depreciationLast3Avg;
		this.existingEmi = existingEmi;
		this.userDetail = userDetail;
		this.incomeDetail = incomeDetail;
	}



	public double getPatAsPerLatestItr() {
		return patAsPerLatestItr;
	}



	public void setPatAsPerLatestItr(double patAsPerLatestItr) {
		this.patAsPerLatestItr = patAsPerLatestItr;
	}



	public double getDepreciationLast3Avg() {
		return depreciationLast3Avg;
	}



	public void setDepreciationLast3Avg(double depreciationLast3Avg) {
		this.depreciationLast3Avg = depreciationLast3Avg;
	}



	public double getExistingEmi() {
		return existingEmi;
	}



	public void setExistingEmi(double existingEmi) {
		this.existingEmi = existingEmi;
	}



	public UserDetail getUserDetail() {
		return userDetail;
	}



	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}



	public IncomeDetail getIncomeDetail() {
		return incomeDetail;
	}



	public void setIncomeDetail(IncomeDetail incomeDetail) {
		this.incomeDetail = incomeDetail;
	}



	@Override
	public String toString() {
		return "SelfEmployedBusiness [patAsPerLatestItr=" + patAsPerLatestItr + ", depreciationLast3Avg="
				+ depreciationLast3Avg + ", existingEmi=" + existingEmi + ", userDetail=" + userDetail
				+ ", incomeDetail=" + incomeDetail + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
