package com.lti.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetail {
	
	@Id 


	//@GeneratedValue

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
	
	
	
	
	public UserDetail() 
	{
	
	}


	public UserDetail(String userId, String firstName, String middleName, String lastName, String emailId,
			String password, String phoneno, String dob, String gender, String residentType, int aadharNumber, String panNumber) {
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
	}


	public String getUserId() 
	{
		return userId;
	}


	public void setUserId(String userId) 
	{
		this.userId = userId;
	}


	public String getFirstName() 
	{
		return firstName;
	}


	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}


	public String getMiddleName() 
	{
		return middleName;
	}


	public void setMiddleName(String middleName) 
	{
		this.middleName = middleName;
	}


	public String getLastName() 
	{
		return lastName;
	}


	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}


	public String getEmailId() 
	{
		return emailId;
	}


	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}


	public String getPassword() 
	{
		return password;
	}


	public void setPassword(String password) 
	{
		this.password = password;
	}


	public String getPhoneno() 
	{
		return phoneno;
	}


	public void setPhoneno(String phoneno) 
	{
		this.phoneno = phoneno;
	}


	public String getDob() 
	{
		return dob;
	}


	public void setDob(String dob) 
	{
		this.dob = dob;
	}


	public String getGender() 
	{
		return gender;
	}


	public void setGender(String gender) 
	{
		this.gender = gender;
	}


	public String getResidentType() 
	{
		return residentType;
	}


	public void setResidentType(String residentType) 
	{
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


	@Override
	public String toString() {
		return "UserDetail [userId=" + userId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", emailId=" + emailId + ", password=" + password + ", phoneno=" + phoneno
				+ ", dob=" + dob + ", gender=" + gender + ", residentType=" + residentType + ", aadharNumber="
				+ aadharNumber + ", panNumber=" + panNumber + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	
	
	
	
	

}
