/*package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class IncomeDetail {

	@Id 
	@GeneratedValue
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private UserDetail userId;
	
	private String typeOfEmployment;
	
	
	public IncomeDetail() {
		super();
	
	}


	public IncomeDetail(String userId, String typeOfEmployment) {
		super();
		this.userId = userId;
		this.typeOfEmployment = typeOfEmployment;
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
		return "IncomeDetail [userId=" + userId + ", typeOfEmployment=" + typeOfEmployment + "]";
	}
	
	

}
*/