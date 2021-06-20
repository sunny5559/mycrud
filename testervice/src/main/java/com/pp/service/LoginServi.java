package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.LoginDto;
import com.pp.repository.Loginrepo;


@Service
public class LoginServi {
	
	@Autowired
	Loginrepo  loginrepo;
	
	
	public LoginDto submittLogin(LoginDto logindto)
	{
		
		System.out.println("inside service submittmethod");
		
		System.out.println(logindto.getEmailId());
		
		System.out.println(logindto.getPassword());
		
		
		
		
		return loginrepo.submittLogin(logindto);
		
	}
	
	
	

}
