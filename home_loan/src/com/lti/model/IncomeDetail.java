package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class IncomeDetail {

	@Id 
	@GeneratedValue
	private String typeOfEmployment;
	
	@OneToOne(mappedBy="incomeDetail") //Bidirectional reln inverse side
	private UserDetail userDetail;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="TypeOfEmployment")
	private Salaried salaried;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="TypeOfEmployment")
	private SelfEmployedBusiness selfEmployedBusiness;


	public IncomeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IncomeDetail(String typeOfEmployment, UserDetail userDetail, Salaried salaried,
			SelfEmployedBusiness selfEmployedBusiness) {
		super();
		this.typeOfEmployment = typeOfEmployment;
		this.userDetail = userDetail;
		this.salaried = salaried;
		this.selfEmployedBusiness = selfEmployedBusiness;
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


	public Salaried getSalaried() {
		return salaried;
	}


	public void setSalaried(Salaried salaried) {
		this.salaried = salaried;
	}


	public SelfEmployedBusiness getSelfEmployedBusiness() {
		return selfEmployedBusiness;
	}


	public void setSelfEmployedBusiness(SelfEmployedBusiness selfEmployedBusiness) {
		this.selfEmployedBusiness = selfEmployedBusiness;
	}


	@Override
	public String toString() {
		return "IncomeDetail [typeOfEmployment=" + typeOfEmployment + ", userDetail=" + userDetail + ", salaried="
				+ salaried + ", selfEmployedBusiness=" + selfEmployedBusiness + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	
}
