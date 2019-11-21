package com.lti.model;

public class Document {
	
	private String userId;
	private String pancard;
	private String aadharCard;
	private String voterId;
	private String salarySlip;
	private String lou;
	private String securityCheck;
	private String nocFromBuilder;
	private String aggrement;
	
	public Document() {
		super();
		
	}

	public Document(String userId, String pancard, String aadharCard, String voterId, String salarySlip, String lou,
			String securityCheck, String nocFromBuilder, String aggrement) {
		super();
		this.userId = userId;
		this.pancard = pancard;
		this.aadharCard = aadharCard;
		this.voterId = voterId;
		this.salarySlip = salarySlip;
		this.lou = lou;
		this.securityCheck = securityCheck;
		this.nocFromBuilder = nocFromBuilder;
		this.aggrement = aggrement;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}

	public String getLou() {
		return lou;
	}

	public void setLou(String lou) {
		this.lou = lou;
	}

	public String getSecurityCheck() {
		return securityCheck;
	}

	public void setSecurityCheck(String securityCheck) {
		this.securityCheck = securityCheck;
	}

	public String getNocFromBuilder() {
		return nocFromBuilder;
	}

	public void setNocFromBuilder(String nocFromBuilder) {
		this.nocFromBuilder = nocFromBuilder;
	}

	public String getAggrement() {
		return aggrement;
	}

	public void setAggrement(String aggrement) {
		this.aggrement = aggrement;
	}

	@Override
	public String toString() {
		return "Document [userId=" + userId + ", pancard=" + pancard + ", aadharCard=" + aadharCard + ", voterId="
				+ voterId + ", salarySlip=" + salarySlip + ", lou=" + lou + ", securityCheck=" + securityCheck
				+ ", nocFromBuilder=" + nocFromBuilder + ", aggrement=" + aggrement + "]";
	}
	
	
	
	

}
