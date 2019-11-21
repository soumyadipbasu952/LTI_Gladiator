package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id 
	@GeneratedValue
	private String userId;
	private String address1;
	private String address2;
	private String landMark;
	private String state;
	private String city;
	private int pin;
	
	
	
	
	public Address() 
	{
		super();
		
	}

	public Address(String userId, String address1, String address2, String landMark, String state, String city,
			int pin) 
	{
		super();
		this.userId = userId;
		this.address1 = address1;
		this.address2 = address2;
		this.landMark = landMark;
		this.state = state;
		this.city = city;
		this.pin = pin;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [userId=" + userId + ", address1=" + address1 + ", address2=" + address2 + ", landMark="
				+ landMark + ", state=" + state + ", city=" + city + ", pin=" + pin + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
}
