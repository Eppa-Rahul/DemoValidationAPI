package com.dmvalid.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.dmvalid.entity.AddressTO_Smpl_1;
import com.dmvalid.entity.ClientTO;
import com.dmvalid.entity.ClientTO_Smpl_3;

public class ClientOp {
	public static void main(String args[]) {
		//private static final Logger logger = LogManager.getLogger(ClientOp.class);

		ClientTO clientTO= new ClientTO_Smpl_3();
		clientTO.setName("");
		clientTO.setPassword("");
		clientTO.setPhone_num(Integer.parseInt("0"));
		
		clientTO.setAddress(new AddressTO_Smpl_1());
		System.out.println(clientTO.getName());
		System.out.println(clientTO.getPassword());
		System.out.println(clientTO);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		System.out.println("ValidatorFactory Impl "+factory); //(hibernate's) ValidatorFactoryImpl
		Validator validator = factory.getValidator();  //(hibernate's) ValidatorImpl
		System.out.println("Validator Impl "+validator);
		Set<ConstraintViolation<ClientTO>> violations = validator.validate(clientTO);
		
		System.out.println("violation errors:");
		for (ConstraintViolation<ClientTO> violation : violations) {
			System.out.println(violation); 
		}
	}
	

}
