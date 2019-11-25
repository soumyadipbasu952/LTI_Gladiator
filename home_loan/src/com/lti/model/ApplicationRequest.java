package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ApplicationRequest {
	
	
	@Id
	private String applicationId;//Generated here
	
	private double amtRequired;//from Salaried/self-employed
	private float tenureYear;//from Salaried/self-employed
	private double amtGrantable;//from Salaried/self-employed
	private String computerApproval;//from Salaried/self-employed
	private String customerWillingStatus;//from jsp page
	private String adminApproval;//generated here
	private String status;//generated here: approved, rejected,pending

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserDetail userDetail;
	
	public ApplicationRequest() 
	{
		super();
		
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public double getAmtRequired() {
		return amtRequired;
	}

	public void setAmtRequired(double amtRequired) {
		this.amtRequired = amtRequired;
	}

	public float getTenureYear() {
		return tenureYear;
	}

	public void setTenureYear(float tenureYear) {
		this.tenureYear = tenureYear;
	}

	public double getAmtGrantable() {
		return amtGrantable;
	}

	public void setAmtGrantable(double amtGrantable) {
		this.amtGrantable = amtGrantable;
	}

	public String getComputerApproval() {
		return computerApproval;
	}

	public void setComputerApproval(String computerApproval) {
		this.computerApproval = computerApproval;
	}

	public String getCustomerWillingStatus() {
		return customerWillingStatus;
	}

	public void setCustomerWillingStatus(String customerWillingStatus) {
		this.customerWillingStatus = customerWillingStatus;
	}

	public String getAdminApproval() {
		return adminApproval;
	}

	public void setAdminApproval(String adminApproval) {
		this.adminApproval = adminApproval;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public ApplicationRequest(String applicationId, double amtRequired, float tenureYear,
			double amtGrantable, String computerApproval, String customerWillingStatus, String adminApproval,
			String status,  UserDetail userDetail) {
		super();
		this.applicationId = applicationId;
		this.amtRequired = amtRequired;
		this.tenureYear = tenureYear;
		this.amtGrantable = amtGrantable;
		this.computerApproval = computerApproval;
		this.customerWillingStatus = customerWillingStatus;
		this.adminApproval = adminApproval;
		this.status = status;
	
		this.userDetail = userDetail;
	}
	
	

	
}
