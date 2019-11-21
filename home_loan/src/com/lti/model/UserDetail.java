package com.lti.model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetail {
	
	@Id 
	@GeneratedValue
	private String userId;

	

	private String firstName;
	private String middleName;
	private String lastName;
	private String emailId;
	private String password;
	private String phoneno;
	private String dob;
	private String gender;
	private String residentType;
	private int aadharNumber;
	private String panNumber; 
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private IncomeDetail incomeDetail;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private SelfEmployedBusiness selfEmployedBusiness;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private Salaried salaried;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private ApplicationRequest applicationRequest;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private Document document;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private BankDetail bankDetail;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private EmiTransaction emiTransaction;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private PropertyAddress propertyAddress;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="UserId")
	private PropertyDetail propertyDetail;
	
	
	

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public UserDetail(String userId, String firstName, String middleName, String lastName, String emailId,
			String password, String phoneno, String dob, String gender, String residentType, int aadharNumber,
			String panNumber, IncomeDetail incomeDetail, SelfEmployedBusiness selfEmployedBusiness, Salaried salaried,
			Address address, ApplicationRequest applicationRequest, Document document, BankDetail bankDetail,
			EmiTransaction emiTransaction, PropertyAddress propertyAddress, PropertyDetail propertyDetail) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phoneno = phoneno;
		this.dob = dob;
		this.gender = gender;
		this.residentType = residentType;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
		this.incomeDetail = incomeDetail;
		this.selfEmployedBusiness = selfEmployedBusiness;
		this.salaried = salaried;
		this.address = address;
		this.applicationRequest = applicationRequest;
		this.document = document;
		this.bankDetail = bankDetail;
		this.emiTransaction = emiTransaction;
		this.propertyAddress = propertyAddress;
		this.propertyDetail = propertyDetail;
	}



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResidentType() {
		return residentType;
	}

	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public IncomeDetail getIncomeDetail() {
		return incomeDetail;
	}

	public void setIncomeDetail(IncomeDetail incomeDetail) {
		this.incomeDetail = incomeDetail;
	}

	public SelfEmployedBusiness getSelfEmployedBusiness() {
		return selfEmployedBusiness;
	}

	public void setSelfEmployedBusiness(SelfEmployedBusiness selfEmployedBusiness) {
		this.selfEmployedBusiness = selfEmployedBusiness;
	}

	public Salaried getSalaried() {
		return salaried;
	}

	public void setSalaried(Salaried salaried) {
		this.salaried = salaried;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ApplicationRequest getApplicationRequest() {
		return applicationRequest;
	}

	public void setApplicationRequest(ApplicationRequest applicationRequest) {
		this.applicationRequest = applicationRequest;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public BankDetail getBankDetail() {
		return bankDetail;
	}

	public void setBankDetail(BankDetail bankDetail) {
		this.bankDetail = bankDetail;
	}

	public EmiTransaction getEmiTransaction() {
		return emiTransaction;
	}

	public void setEmiTransaction(EmiTransaction emiTransaction) {
		this.emiTransaction = emiTransaction;
	}

	public PropertyAddress getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(PropertyAddress propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public PropertyDetail getPropertyDetail() {
		return propertyDetail;
	}

	public void setPropertyDetail(PropertyDetail propertyDetail) {
		this.propertyDetail = propertyDetail;
	}



	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", emailId=" + emailId + ", password=" + password + ", phoneno=" + phoneno
				+ ", dob=" + dob + ", gender=" + gender + ", residentType=" + residentType + ", aadharNumber="
				+ aadharNumber + ", panNumber=" + panNumber + ", incomeDetail=" + incomeDetail
				+ ", selfEmployedBusiness=" + selfEmployedBusiness + ", salaried=" + salaried + ", address=" + address
				+ ", applicationRequest=" + applicationRequest + ", document=" + document + ", bankDetail=" + bankDetail
				+ ", emiTransaction=" + emiTransaction + ", propertyAddress=" + propertyAddress + ", propertyDetail="
				+ propertyDetail + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
