package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PropertyDetail {

	@Id @GeneratedValue
	private String userId;
	private String propertyType;
	private String propertyName;
	private double estimatedAmount;
	
	public PropertyDetail() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public PropertyDetail(String userId, String propertyType, String propertyName, double estimatedAmount) {
		super();
		this.userId = userId;
		this.propertyType = propertyType;
		this.propertyName = propertyName;
		this.estimatedAmount = estimatedAmount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	@Override
	public String toString() {
		return "PropertyDetail [userId=" + userId + ", propertyType=" + propertyType + ", propertyName=" + propertyName
				+ ", estimatedAmount=" + estimatedAmount + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
