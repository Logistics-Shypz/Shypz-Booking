package com.shypz.shypzbooking.pojo;

public class Address {
	
	private long addressId;
	private String addressLine;
	private String addressArea;
	private String addressCity;
	private String addressPincode;
	private String addressState;
	private String addressCountry;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(long addressId, String addressLine, String addressArea, String addressCity, String addressPincode,
			String addressState, String addressCountry) {
		super();
		this.addressId = addressId;
		this.addressLine = addressLine;
		this.addressArea = addressArea;
		this.addressCity = addressCity;
		this.addressPincode = addressPincode;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
	}


	public long getAddressId() {
		return addressId;
	}


	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}


	public String getAddressLine() {
		return addressLine;
	}


	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public String getAddressArea() {
		return addressArea;
	}


	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}


	public String getAddressCity() {
		return addressCity;
	}


	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}


	public String getAddressPincode() {
		return addressPincode;
	}


	public void setAddressPincode(String addressPincode) {
		this.addressPincode = addressPincode;
	}


	public String getAddressState() {
		return addressState;
	}


	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}


	public String getAddressCountry() {
		return addressCountry;
	}


	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	
	
	
	
	

}
