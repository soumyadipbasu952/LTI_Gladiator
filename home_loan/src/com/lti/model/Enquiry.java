package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquiry")
public class Enquiry {
	@Id	@GeneratedValue
	int id;
	private double requiredAmt;
	private double salary;
	private int age;
	private int retirementAge;
	private double costOfLiving;
	private double tenures;
	private double currentEmi;
	//private double savings;
	private double estimatedAmt;
	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enquiry(double requiredAmt, double salary, int age, int retirementAge, double costOfLiving, double tenures,
			double currentEmi, double savings, double estimatedAmt) {
		super();
		this.requiredAmt = requiredAmt;
		this.salary = salary;
		this.age = age;
		this.retirementAge = retirementAge;
		this.costOfLiving = costOfLiving;
		this.tenures = tenures;
		this.currentEmi = currentEmi;
		//this.savings = savings;
		this.estimatedAmt = estimatedAmt;
	}
	public double getRequiredAmt() {
		return requiredAmt;
	}
	public void setRequiredAmt(double requiredAmt) {
		this.requiredAmt = requiredAmt;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	public double getCostOfLiving() {
		return costOfLiving;
	}
	public void setCostOfLiving(double costOfLiving) {
		this.costOfLiving = costOfLiving;
	}
	public double getTenures() {
		return tenures;
	}
	public void setTenures(double tenures) {
		this.tenures = tenures;
	}
	public double getCurrentEmi() {
		return currentEmi;
	}
	public void setCurrentEmi(double currentEmi) {
		this.currentEmi = currentEmi;
	}
	/*public double getSavings() {
		return savings;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}*/
	public double getEstimatedAmt() {
		return estimatedAmt;
	}
	public void setEstimatedAmt(double estimatedAmt) {
		this.estimatedAmt = estimatedAmt;
	}
	
	

}
