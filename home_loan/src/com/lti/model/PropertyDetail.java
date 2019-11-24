package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="propertydetails")
public class PropertyDetail {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PropertyId")
	@SequenceGenerator(sequenceName = "PropertyId", name = "PropertyId", allocationSize = 1)
	int PropertyId;
	private String propertyType;
	private String propertyName;
	private double estimatedAmount;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserDetail userDetail;
	
	public PropertyDetail() 
	{
		
	}

	public PropertyDetail(int propertyId, String propertyType, String propertyName, double estimatedAmount,
			UserDetail userDetail) {
		super();
		PropertyId = propertyId;
		this.propertyType = propertyType;
		this.propertyName = propertyName;
		this.estimatedAmount = estimatedAmount;
		this.userDetail = userDetail;
	}

	public int getPropertyId() {
		return PropertyId;
	}

	public void setPropertyId(int propertyId) {
		PropertyId = propertyId;
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

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "PropertyDetail [PropertyId=" + PropertyId + ", propertyType=" + propertyType + ", propertyName="
				+ propertyName + ", estimatedAmount=" + estimatedAmount + ", userDetail=" + userDetail + "]";
	}

	
		
}
