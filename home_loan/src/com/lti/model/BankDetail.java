package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class BankDetail {

	@Id @GeneratedValue
	private String userId;
	private String bankName;
	private String ifsc;
	private String accountHolderName;
	private String accountType;
	private int accountNumber;
	public BankDetail() {
		super();
		
		
	}
	public BankDetail(String userId, String bankName, String ifsc, String accountHolderName, String accountType,
			int accountNumber) {
		super();
		this.userId = userId;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	@Override
	public String toString() {
		return "BankDetail [userId=" + userId + ", bankName=" + bankName + ", ifsc=" + ifsc + ", accountHolderName="
				+ accountHolderName + ", accountType=" + accountType + ", accountNumber=" + accountNumber + "]";
	}
	
	
	
	

}
