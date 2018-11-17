package com.dmvalid.validators;


import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=X_CVAImpl.class)
@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface X_CustomValidatorAnnotation {
	//Define default DemoCustomValidatorAnnotation val
	//public String value() default "LUV";
	//Define default error message
	public String message() default "*not a valid phone number";
	//Define default groups
	public Class<?>[] groups() default{};
	//Define default payloads
	public Class<? extends Payload>[] payload() default{};
}
