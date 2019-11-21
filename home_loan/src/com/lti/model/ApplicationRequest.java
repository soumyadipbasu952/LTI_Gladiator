package com.lti.model;

import java.time.LocalDate;

public class ApplicationRequest {
	
	private String applicationId;
	private String userId;
	private double amtRequired;
	private float tenureYear;
	private LocalDate reqTimeApplied;
	private double amtGrantable;
	private String computerApproval;
	private String customerWillingStatus;
	private String adminApproval;
	private String status;
	private String remark;
	
	public ApplicationRequest() {
		super();
		
	}

	public ApplicationRequest(String applicationId, String userId, double amtRequired, float tenureYear,
			LocalDate reqTimeApplied, double amtGrantable, String computerApproval, String customerWillingStatus,
			String adminApproval, String status, String remark) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.amtRequired = amtRequired;
		this.tenureYear = tenureYear;
		this.reqTimeApplied = reqTimeApplied;
		this.amtGrantable = amtGrantable;
		this.computerApproval = computerApproval;
		this.customerWillingStatus = customerWillingStatus;
		this.adminApproval = adminApproval;
		this.status = status;
		this.remark = remark;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public LocalDate getReqTimeApplied() {
		return reqTimeApplied;
	}

	public void setReqTimeApplied(LocalDate reqTimeApplied) {
		this.reqTimeApplied = reqTimeApplied;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "ApplicationRequest [applicationId=" + applicationId + ", userId=" + userId + ", amtRequired="
				+ amtRequired + ", tenureYear=" + tenureYear + ", amtGrantable=" + amtGrantable + ", computerApproval="
				+ computerApproval + ", customerWillingStatus=" + customerWillingStatus + ", adminApproval="
				+ adminApproval + ", status=" + status + ", remark=" + remark + "]";
	}
	
	
	
	

}
