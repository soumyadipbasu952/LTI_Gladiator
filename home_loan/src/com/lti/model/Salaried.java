/*package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Salaried {

	@Id @GeneratedValue
	private double netAmtSalary;
	private double existingEmi;
	private int retirementAge;
	private String organizationType;
	private String employerName;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private UserDetail userId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private String typeOfEmployment;
	
    
    public Salaried() {
		super();
		
	}


	public Salaried(double netAmtSalary, double existingEmi, int retirementAge, String organizationType,
			String employerName, String userId, String typeOfEmployment) {
		super();
		this.netAmtSalary = netAmtSalary;
		this.existingEmi = existingEmi;
		this.retirementAge = retirementAge;
		this.organizationType = organizationType;
		this.employerName = employerName;
		this.userId = userId;
		this.typeOfEmployment = typeOfEmployment;
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
		return "Salaried [netAmtSalary=" + netAmtSalary + ", existingEmi=" + existingEmi + ", retirementAge="
				+ retirementAge + ", organizationType=" + organizationType + ", employerName=" + employerName
				+ ", userId=" + userId + ", typeOfEmployment=" + typeOfEmployment + "]";
	}
    
    
    

}*/
