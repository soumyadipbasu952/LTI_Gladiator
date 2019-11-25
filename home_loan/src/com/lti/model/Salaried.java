package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity @Table(name="salariedDetails")
public class Salaried {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salariedId")
	@SequenceGenerator(sequenceName = "salariedId", name = "salariedId",initialValue = 1, allocationSize = 1)
	int salariedId;
	private double netAmtSalary;
	private double existingEmi;
	private int retirementAge;
	private String organizationType;
	private String employerName;
	private double requiredAmt;
	private int age;
	private double costOfLiving;
	private int tenure;
	private double estimatedAmt;
	//@Column(name="type_of_employment")
	private String typeOfEmployment="salaried";
	private boolean status;
	
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


	public Salaried(int salariedId, double netAmtSalary, double existingEmi, int retirementAge, String organizationType,
			String employerName, double requiredAmt, int age, double costOfLiving, int tenure, double estimatedAmt,
			String typeOfEmployment, boolean status, UserDetail userDetail) {
		super();
		this.salariedId = salariedId;
		this.netAmtSalary = netAmtSalary;
		this.existingEmi = existingEmi;
		this.retirementAge = retirementAge;
		this.organizationType = organizationType;
		this.employerName = employerName;
		this.requiredAmt = requiredAmt;
		this.age = age;
		this.costOfLiving = costOfLiving;
		this.tenure = tenure;
		this.estimatedAmt = estimatedAmt;
		this.typeOfEmployment = typeOfEmployment;
		this.status = status;
		this.userDetail = userDetail;
	}


	public int getSalariedId() {
		return salariedId;
	}


	public void setSalariedId(int salariedId) {
		this.salariedId = salariedId;
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


	public double getRequiredAmt() {
		return requiredAmt;
	}


	public void setRequiredAmt(double requiredAmt) {
		this.requiredAmt = requiredAmt;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getCostOfLiving() {
		return costOfLiving;
	}


	public void setCostOfLiving(double costOfLiving) {
		this.costOfLiving = costOfLiving;
	}


	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	public double getEstimatedAmt() {
		return estimatedAmt;
	}


	public void setEstimatedAmt(double estimatedAmt) {
		this.estimatedAmt = estimatedAmt;
	}


	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}


	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public UserDetail getUserDetail() {
		return userDetail;
	}


	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}


	@Override
	public String toString() {
		return "Salaried [salariedId=" + salariedId + ", netAmtSalary=" + netAmtSalary + ", existingEmi=" + existingEmi
				+ ", retirementAge=" + retirementAge + ", organizationType=" + organizationType + ", employerName="
				+ employerName + ", requiredAmt=" + requiredAmt + ", age=" + age + ", costOfLiving=" + costOfLiving
				+ ", tenure=" + tenure + ", estimatedAmt=" + estimatedAmt + ", typeOfEmployment=" + typeOfEmployment
				+ ", status=" + status + ", userDetail=" + userDetail + "]";
	}


	
	




	
}
    


