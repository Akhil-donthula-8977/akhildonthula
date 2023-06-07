package com.portfolio.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GmailValidator implements ConstraintValidator<gmail,String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		/*Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Visit W3Schools!");
	    boolean matchFound = matcher.find();*/
		final Pattern VALIDEMAILADDRESSREGEX = 
			    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		
		if(value.length()==0) {
			return false;
		}
		else {
	        Matcher matcher = VALIDEMAILADDRESSREGEX.matcher(value);
	        if(matcher.matches()) {
	        	return true;
	        }
	        else {
	        	return false;
	        }

		}
		
	}

}
