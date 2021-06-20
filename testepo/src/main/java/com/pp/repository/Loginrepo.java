package com.pp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.LoginDto;

@Repository
public class Loginrepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public LoginDto submittLogin(LoginDto logindto) {

		System.out.println("inside Loginrepo method");

		System.out.println(logindto.getEmailId());
		System.out.println(logindto.getPassword());

		List<LoginDto> login = hibernateTemplate.find("from LoginDto al where al.emailId = ? and al.password = ?",
				logindto.getEmailId(), logindto.getPassword());

		for (LoginDto loginDto2 : login) {
			System.out.println(loginDto2.getId());
			System.out.println(loginDto2.getEmailId());
			System.out.println(loginDto2.getPassword());
		}
		
		 LoginDto user2 = login.get(0);
		 
		 return user2;
		 

	}

}
