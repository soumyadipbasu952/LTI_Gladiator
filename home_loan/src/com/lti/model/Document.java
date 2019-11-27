//package com.lti.model;
//
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//public class Document {
//	
//	
//	@Id @GeneratedValue
//	int id;
//	
//	private String pancard;
//	private String aadharCard;
//	private String voterId;
//	private String salarySlip;
//	private String lou;
//	private String securityCheck;
//	private String nocFromBuilder;
//	private String aggrement;
//	
//	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name="userId")
//	private UserDetail userDetail;
//	
//	
//	
//	public Document() {
//		super();
//		
//	}
//
//
//
//	public Document(String pancard, String aadharCard, String voterId, String salarySlip, String lou,
//			String securityCheck, String nocFromBuilder, String aggrement, UserDetail userDetail) {
//		super();
//		this.pancard = pancard;
//		this.aadharCard = aadharCard;
//		this.voterId = voterId;
//		this.salarySlip = salarySlip;
//		this.lou = lou;
//		this.securityCheck = securityCheck;
//		this.nocFromBuilder = nocFromBuilder;
//		this.aggrement = aggrement;
//		this.userDetail = userDetail;
//	}
//
//
//
//	public String getPancard() {
//		return pancard;
//	}
//
//
//
//	public void setPancard(String pancard) {
//		this.pancard = pancard;
//	}
//
//
//
//	public String getAadharCard() {
//		return aadharCard;
//	}
//
//
//
//	public void setAadharCard(String aadharCard) {
//		this.aadharCard = aadharCard;
//	}
//
//
//
//	public String getVoterId() {
//		return voterId;
//	}
//
//
//
//	public void setVoterId(String voterId) {
//		this.voterId = voterId;
//	}
//
//
//
//	public String getSalarySlip() {
//		return salarySlip;
//	}
//
//
//
//	public void setSalarySlip(String salarySlip) {
//		this.salarySlip = salarySlip;
//	}
//
//
//
//	public String getLou() {
//		return lou;
//	}
//
//
//
//	public void setLou(String lou) {
//		this.lou = lou;
//	}
//
//
//
//	public String getSecurityCheck() {
//		return securityCheck;
//	}
//
//
//
//	public void setSecurityCheck(String securityCheck) {
//		this.securityCheck = securityCheck;
//	}
//
//
//
//	public String getNocFromBuilder() {
//		return nocFromBuilder;
//	}
//
//
//
//	public void setNocFromBuilder(String nocFromBuilder) {
//		this.nocFromBuilder = nocFromBuilder;
//	}
//
//
//
//	public String getAggrement() {
//		return aggrement;
//	}
//
//
//
//	public void setAggrement(String aggrement) {
//		this.aggrement = aggrement;
//	}
//
//
//
//	public UserDetail getUserDetail() {
//		return userDetail;
//	}
//
//
//
//	public void setUserDetail(UserDetail userDetail) {
//		this.userDetail = userDetail;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return "Document [pancard=" + pancard + ", aadharCard=" + aadharCard + ", voterId=" + voterId + ", salarySlip="
//				+ salarySlip + ", lou=" + lou + ", securityCheck=" + securityCheck + ", nocFromBuilder="
//				+ nocFromBuilder + ", aggrement=" + aggrement + ", userDetail=" + userDetail + "]";
//	}
//
//	
//	
//
//}
