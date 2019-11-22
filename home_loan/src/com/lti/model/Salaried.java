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

	@Id @GeneratedValue
	int salaried_id;
	
	
	private double netAmtSalary;
	private double existingEmi;
	private int retirementAge;
	private String organizationType;
	private String employerName;
	private String typeOfEmployment="salaried";
	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER,)
//	@JoinColumn(name="userId")
//	public UserDetail userDetail;
//	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserDetail userDetail;
	

	public Salaried()
	{
	}

	public Salaried(int salaried_id, double netAmtSalary, double existingEmi, int retirementAge,
			String organizationType, String employerName, String typeOfEmployment, UserDetail userDetail) {
		super();
		this.salaried_id = salaried_id;
		this.netAmtSalary = netAmtSalary;
		this.existingEmi = existingEmi;
		this.retirementAge = retirementAge;
		this.organizationType = organizationType;
		this.employerName = employerName;
		this.typeOfEmployment = typeOfEmployment;
		this.userDetail = userDetail;
	}

	public int getSalaried_id() {
		return salaried_id;
	}

	public void setSalaried_id(int salaried_id) {
		this.salaried_id = salaried_id;
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

	@Override
	public String toString() {
		return "Salaried [salaried_id=" + salaried_id + ", netAmtSalary=" + netAmtSalary + ", existingEmi="
				+ existingEmi + ", retirementAge=" + retirementAge + ", organizationType=" + organizationType
				+ ", employerName=" + employerName + ", typeOfEmployment=" + typeOfEmployment + ", userDetail="
				+ userDetail + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
	
	
}
    


