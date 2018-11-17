package com.dmvalid.entity;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.dmvalid.validators.X_CustomValidatorAnnotation;

public class ClientTO_Smpl_3 implements ClientTO {
	

	@NotNull
	private String name;
	private String emailID;
	@Size(min=5, max=12)
	private String password;
	@Min(value=0)
	//@X_CustomValidatorAnnotation
	//@Digits(integer = 10, fraction = 0,message = "*invalid phone number")
	private Integer phone_num;
	private String type;
	
	private String regDate;
	@Valid
	private AddressTO_Smpl_1 address;
	
	public ClientTO_Smpl_3() {
		// TODO Auto-generated constructor stub
	}	

	public ClientTO_Smpl_3(String clientName, String clientHNO, String clientLND, String clientLOC, String clientStreet,
			String clientCity,String emailID,String password,String phone_num,String type,String regDate) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(Integer phone_num) {
		this.phone_num = phone_num;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	


	

	public AddressTO_Smpl_1 getAddress() {
		return address;
	}

	public void setAddress(AddressTO_Smpl_1 address) {
		//this.address = address;
	}

	@Override
	public String toString() {
		return "ClientTO_Smpl_3 [name=" + name + ", emailID=" + emailID + ", password=" + password + ", phone_num="
				+ phone_num + ", type=" + type + ", regDate=" + regDate + "]";
	}

	public void setStreet(String string) {
		// TODO Auto-generated method stub
		
	}


	


	

	
	
	

}