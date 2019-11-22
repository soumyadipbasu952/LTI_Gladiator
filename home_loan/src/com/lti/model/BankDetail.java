//package com.lti.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//
//@Entity 
//public class BankDetail {
//
//
//	private String bankName;
//	private String ifsc;
//	private String accountHolderName;
//	private String accountType;
//	@Id
//	private int accountNumber;
//	
//	
//	@OneToOne(mappedBy="bankDetail") //Bidirectional reln inverse side
//	private UserDetail userDetail;
//	
//
//	
//	public BankDetail() {
//		super();
//		
//		
//	}
//
//
//
//	public BankDetail(String bankName, String ifsc, String accountHolderName, String accountType, int accountNumber,
//			UserDetail userDetail) {
//		super();
//		this.bankName = bankName;
//		this.ifsc = ifsc;
//		this.accountHolderName = accountHolderName;
//		this.accountType = accountType;
//		this.accountNumber = accountNumber;
//		this.userDetail = userDetail;
//	}
//
//
//
//	public String getBankName() {
//		return bankName;
//	}
//
//
//
//	public void setBankName(String bankName) {
//		this.bankName = bankName;
//	}
//
//
//
//	public String getIfsc() {
//		return ifsc;
//	}
//
//
//
//	public void setIfsc(String ifsc) {
//		this.ifsc = ifsc;
//	}
//
//
//
//	public String getAccountHolderName() {
//		return accountHolderName;
//	}
//
//
//
//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
//
//
//
//	public String getAccountType() {
//		return accountType;
//	}
//
//
//
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
//
//
//
//	public int getAccountNumber() {
//		return accountNumber;
//	}
//
//
//
//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber = accountNumber;
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
//		return "BankDetail [bankName=" + bankName + ", ifsc=" + ifsc + ", accountHolderName=" + accountHolderName
//				+ ", accountType=" + accountType + ", accountNumber=" + accountNumber + ", userDetail=" + userDetail
//				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
//				+ "]";
//	}
//	
//	
//	
//	
//	
//
//}
