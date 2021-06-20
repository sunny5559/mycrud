package com.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.LoginDto;
import com.pp.service.RegistrationService;
import com.pp.validator.RegistrationValidator;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService registrationservice;
	
	@Autowired
	RegistrationValidator registrationvalidator;
	
	 @RequestMapping("/registration") 
	 public String registration(Map<String,Object> map )
	 { 
      map.put("regis", new LoginDto());
	 
	  System.out.println("registration page");
	  return "registration";
	  }
	  

	
	@RequestMapping(value="/showregister" , method = RequestMethod.POST)
	public String submitregister(@ModelAttribute("regis") LoginDto logindto,BindingResult result)
	{
		
		System.out.println(logindto.getFname());
		
		System.out.println(logindto.getLname());
		
		System.out.println(logindto.getEmailId());

		System.out.println(logindto.getPassword());

		System.out.println(logindto.getContact());

		
		 
		
		registrationvalidator.validate(logindto, result);
		
		if(result.hasErrors())
		{
			return "registration";
		}
		else {
			
		
			registrationservice.submitregistration(logindto);
			return "registration";
		}
		
		
		
	}
	

}
