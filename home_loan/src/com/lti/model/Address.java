package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="addressDetail")
public class Address 
{
	

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AddressId")
	@SequenceGenerator(sequenceName = "AddressId", name = "AddressId", allocationSize = 1)
	int AddressId;
	
	private String address1;
	private String address2;
	private String landMark;
	private String state;
	private String city;
	private int pin;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="userId")
	private UserDetail userDetail;

	public Address() 
	{
		super();
		
	}

	public Address(int addressId, String address1, String address2, String landMark, String state, String city, int pin,
			UserDetail userDetail) {
		super();
		AddressId = addressId;
		this.address1 = address1;
		this.address2 = address2;
		this.landMark = landMark;
		this.state = state;
		this.city = city;
		this.pin = pin;
		this.userDetail = userDetail;
	}

	public int getAddressId() {
		return AddressId;
	}

	public void setAddressId(int addressId) {
		AddressId = addressId;
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

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "Address [AddressId=" + AddressId + ", address1=" + address1 + ", address2=" + address2 + ", landMark="
				+ landMark + ", state=" + state + ", city=" + city + ", pin=" + pin + ", userDetail=" + userDetail
				+ "]";
	}

	
}
