package com.pp.validator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.LoginDto;
import com.pp.repository.Registrationrepo;
import com.pp.service.RegistrationService;

@Component
public class RegistrationValidator implements Validator {

	@Autowired
	RegistrationService regsr;
	
	@Autowired
	Registrationrepo regrepo;
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		
		// TODO Auto-generated method stub

		LoginDto loginDto = (LoginDto) target;
		
	
		
	
		ValidationUtils.rejectIfEmpty(errors, "fname","error.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "lname","error.lname.empty");
		ValidationUtils.rejectIfEmpty(errors, "contact", "error.contact.empty");
		ValidationUtils.rejectIfEmpty(errors, "emailId","error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "password","error.password.empty");
		
		
		if(loginDto.getFname() != null)
		{
			if(loginDto.getFname().length()<3)
			{
				errors.rejectValue("fname", "error.fname","name must be greater then 3");
				
			}
			if(loginDto.getFname().length()>12)
			{
				errors.rejectValue("fname", "error.fname","name must be less then then 12");
				
			}
		}
		
		
		if(loginDto.getLname() != null)
		{
			if(loginDto.getLname().length()<3)
			{
				errors.rejectValue("lname", "errors.lname", "last name must be between 3 to 12 ");
				
			}
		}
		
		if(loginDto.getContact() != null && loginDto.getContact().trim().length()>0)
		{
			if(loginDto.getContact().matches("^[6-9][0-9]{9}$")!=true)
			{
				errors.rejectValue("contact", "errors.contact", "mobile number must be in digits");
			}
		}
		
		if(loginDto.getEmailId()!= null)
		{
			
			
			/*
			 * if(regsr.getEmail(loginDto.getEmailId()).size()>0) {
			 * errors.rejectValue("emailId", "errors.emailId", "please use another email");
			 * }
			 */
			 
		
	
			if(loginDto.getEmailId().contains("@")!= true)
			{
				errors.rejectValue("emailId", "errors.emailId", "Missing @");
				
			}
			if(loginDto.getEmailId().contains("gmail.com")!= true)
			{
				errors.rejectValue("emailId", "errors.emailId", "Missing gmail.com");
				
			}
			
		}
		
		if(loginDto.getPassword()!= null)
		{
			
		
		}

	}
	
		
	}
	
	


