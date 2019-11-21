package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LoanDetail {

	@Id @GeneratedValue
	private String applicationId;
	private String userId;
	private double interestRate;
	private float tenure;
	private double approvedLoanAmt;
	private LocalDate dateOfApproval;
	private LocalDate dateOfDisbursement;
	private double processingFee;
	private double amountOfDisbursement;
	private String remark;
	
	
	public LoanDetail() {
		super();
		
	}


	public LoanDetail(String applicationId, String userId, double interestRate, float tenure, double approvedLoanAmt,
			LocalDate dateOfApproval, LocalDate dateOfDisbursement, double processingFee, double amountOfDisbursement,
			String remark) {
		super();
		this.applicationId = applicationId;
		this.userId = userId;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.approvedLoanAmt = approvedLoanAmt;
		this.dateOfApproval = dateOfApproval;
		this.dateOfDisbursement = dateOfDisbursement;
		this.processingFee = processingFee;
		this.amountOfDisbursement = amountOfDisbursement;
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


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public float getTenure() {
		return tenure;
	}


	public void setTenure(float tenure) {
		this.tenure = tenure;
	}


	public double getApprovedLoanAmt() {
		return approvedLoanAmt;
	}


	public void setApprovedLoanAmt(double approvedLoanAmt) {
		this.approvedLoanAmt = approvedLoanAmt;
	}


	public LocalDate getDateOfApproval() {
		return dateOfApproval;
	}


	public void setDateOfApproval(LocalDate dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}


	public LocalDate getDateOfDisbursement() {
		return dateOfDisbursement;
	}


	public void setDateOfDisbursement(LocalDate dateOfDisbursement) {
		this.dateOfDisbursement = dateOfDisbursement;
	}


	public double getProcessingFee() {
		return processingFee;
	}


	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}


	public double getAmountOfDisbursement() {
		return amountOfDisbursement;
	}


	public void setAmountOfDisbursement(double amountOfDisbursement) {
		this.amountOfDisbursement = amountOfDisbursement;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "LoanDetail [applicationId=" + applicationId + ", userId=" + userId + ", interestRate=" + interestRate
				+ ", tenure=" + tenure + ", approvedLoanAmt=" + approvedLoanAmt + ", processingFee=" + processingFee
				+ ", amountOfDisbursement=" + amountOfDisbursement + ", remark=" + remark + "]";
	}

    

	
	
	
	
	

}
