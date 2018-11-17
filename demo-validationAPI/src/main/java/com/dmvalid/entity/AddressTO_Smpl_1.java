package com.dmvalid.entity;

import javax.validation.constraints.NotNull;

public class AddressTO_Smpl_1 {
	
	private String street;
	private String HNO;
	private String landMark;
	private String location;
	@NotNull
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHNO() {
		return HNO;
	}
	public void setHNO(String hNO) {
		HNO = hNO;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressTO_Smpl_1 [street=" + street + ", HNO=" + HNO + ", landMark=" + landMark + ", location="
				+ location + ", city=" + city + "]";
	}
	

}
