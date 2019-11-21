package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class Salaried {


	private double netAmtSalary;
	private double existingEmi;
	private int retirementAge;
	private String organizationType;
	private String employerName;
	
	@OneToOne(mappedBy="salaried")
	private UserDetail userDetail;
	
	@OneToOne(mappedBy="salaried")
	private IncomeDetail incomeDetail;
	
    
    public Salaried() {
		super();
		
	}


	public Salaried(double netAmtSalary, double existingEmi, int retirementAge, String organizationType,
			String employerName, UserDetail userDetail, IncomeDetail incomeDetail) {
		super();
		this.netAmtSalary = netAmtSalary;
		this.existingEmi = existingEmi;
		this.retirementAge = retirementAge;
		this.organizationType = organizationType;
		this.employerName = employerName;
		this.userDetail = userDetail;
		this.incomeDetail = incomeDetail;
	}


	public double getNetAmtSalary() {
		return netAmtSalary;
	}


	public void setNetAmtSalary(double netAmtSalary) {
		this.netAmtSalary = netAmtSalary;
	}


	public double getExistingEmi() {
		return existingEmi;
	}


	public void setExistingEmi(double existingEmi) {
		this.existingEmi = existingEmi;
	}


	public int getRetirementAge() {
		return retirementAge;
	}


	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}


	public String getOrganizationType() {
		return organizationType;
	}


	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}


	public String getEmployerName() {
		return employerName;
	}


	public void setEmployerName(String employerName) {
		this.employerName = employerName;
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
		return "Salaried [netAmtSalary=" + netAmtSalary + ", existingEmi=" + existingEmi + ", retirementAge="
				+ retirementAge + ", organizationType=" + organizationType + ", employerName=" + employerName
				+ ", userDetail=" + userDetail + ", incomeDetail=" + incomeDetail + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	

	
}
