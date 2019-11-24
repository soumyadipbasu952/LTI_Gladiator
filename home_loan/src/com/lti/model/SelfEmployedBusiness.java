package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="selfEmployedDetails")
public class SelfEmployedBusiness {

	@Id @GeneratedValue
	private int selfEmployedId;
	
	private double patAsPerLatestItr;
	private double depreciationLast3Avg;
	private double existingEmi;
	private String typeOfEmployment="self-Employed";
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserDetail userDetail;

	public SelfEmployedBusiness(int selfEmployedId, double patAsPerLatestItr, double depreciationLast3Avg,
			double existingEmi, String typeOfEmployment, UserDetail userDetail) {
		super();
		this.selfEmployedId = selfEmployedId;
		this.patAsPerLatestItr = patAsPerLatestItr;
		this.depreciationLast3Avg = depreciationLast3Avg;
		this.existingEmi = existingEmi;
		this.typeOfEmployment = typeOfEmployment;
		this.userDetail = userDetail;
	}

	public int getSelfEmployedId() {
		return selfEmployedId;
	}

	public void setSelfEmployedId(int selfEmployedId) {
		this.selfEmployedId = selfEmployedId;
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

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public SelfEmployedBusiness() {
		super();
	}

	
}
