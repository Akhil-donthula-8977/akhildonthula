package com.portfolio.validations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.ElementType;

@Constraint(validatedBy = GmailValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } ) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface gmail {
   //define default value
	public String value() default "none";
	
	//define error message
	public String error() default "enter a valid email";
	
	//define default groups
    public Class<?>[] groups() default {}; 
    
    //delfault payloads -additional information about error message
    public Class<? extends Payload>[] payload() default {}; 
}
