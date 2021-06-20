package com.pp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.LoginDto;

@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		
		LoginDto login = (LoginDto) target;
		
		
		ValidationUtils.rejectIfEmpty(errors, "emailId","error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "password","error.password.empty");
		
	}

}
