//package com.lti.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity
//public class PropertyDetail {
//
//	@Id @GeneratedValue
//	int id;
//	private String propertyType;
//	private String propertyName;
//	private double estimatedAmount;
//	
//	@OneToOne(mappedBy="propertyDetail") //Bidirectional reln inverse side
//	private UserDetail userDetail;
//	
//	public PropertyDetail() 
//	{
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public PropertyDetail(String propertyType, String propertyName, double estimatedAmount, UserDetail userDetail) {
//		super();
//		this.propertyType = propertyType;
//		this.propertyName = propertyName;
//		this.estimatedAmount = estimatedAmount;
//		this.userDetail = userDetail;
//	}
//
//	public String getPropertyType() {
//		return propertyType;
//	}
//
//	public void setPropertyType(String propertyType) {
//		this.propertyType = propertyType;
//	}
//
//	public String getPropertyName() {
//		return propertyName;
//	}
//
//	public void setPropertyName(String propertyName) {
//		this.propertyName = propertyName;
//	}
//
//	public double getEstimatedAmount() {
//		return estimatedAmount;
//	}
//
//	public void setEstimatedAmount(double estimatedAmount) {
//		this.estimatedAmount = estimatedAmount;
//	}
//
//	public UserDetail getUserDetail() {
//		return userDetail;
//	}
//
//	public void setUserDetail(UserDetail userDetail) {
//		this.userDetail = userDetail;
//	}
//
//	@Override
//	public String toString() {
//		return "PropertyDetail [propertyType=" + propertyType + ", propertyName=" + propertyName + ", estimatedAmount="
//				+ estimatedAmount + ", userDetail=" + userDetail + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
//
//	
//	
//	
//	
//	
//}
