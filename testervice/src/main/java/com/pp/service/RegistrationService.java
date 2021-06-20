package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.LoginDto;
import com.pp.repository.Registrationrepo;

@Service
public class RegistrationService {

@Autowired
Registrationrepo registrationrepo;	


/*
 * public void hello() {
 * 
 * System.out.println("this is hello method");
 * 
 * }
 */

public void submitregistration(LoginDto logindto)
{
	System.out.println("inside registrationservice method");
	
	
	System.out.println(logindto.getFname());
	System.out.println(logindto.getLname());
	System.out.println(logindto.getEmailId());
	System.out.println(logindto.getPassword());
	System.out.println(logindto.getContact());
	
   registrationrepo.saveUser(logindto);
	
}


  public List<LoginDto>getEmail(String email) {
  
  List<LoginDto> login = registrationrepo.getEmail(email);
  
  return login;
  
  }

 
	
}
