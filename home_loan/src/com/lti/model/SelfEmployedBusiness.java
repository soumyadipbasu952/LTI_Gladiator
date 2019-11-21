package com.lti.model;

public class SelfEmployedBusiness {

	
	private double patAsPerLatestItr;
	private double depreciationLast3Avg;
	private double existingEmi;
	private String userId;
	private String typeOfEmployment;
	
	public SelfEmployedBusiness() {
		super();
		
	}

	public SelfEmployedBusiness(double patAsPerLatestItr, double depreciationLast3Avg, double existingEmi,
			String userId, String typeOfEmployment) {
		super();
		this.patAsPerLatestItr = patAsPerLatestItr;
		this.depreciationLast3Avg = depreciationLast3Avg;
		this.existingEmi = existingEmi;
		this.userId = userId;
		this.typeOfEmployment = typeOfEmployment;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	@Override
	public String toString() {
		return "SelfEmployedBusiness [patAsPerLatestItr=" + patAsPerLatestItr + ", depreciationLast3Avg="
				+ depreciationLast3Avg + ", existingEmi=" + existingEmi + ", userId=" + userId + ", typeOfEmployment="
				+ typeOfEmployment + "]";
	}
	
	
	
}
