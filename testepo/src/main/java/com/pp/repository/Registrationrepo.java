package com.pp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.LoginDto;

@Repository
public class Registrationrepo {

	@Autowired
	HibernateTemplate hibernateTemplate;

	public void saveUser(LoginDto loginddto) {
		System.out.println("inside registration save method");

		hibernateTemplate.save(loginddto);

		System.out.println("Data inserted Succesfully....");

	}

	public List<LoginDto> getEmail(String email) {

		List<LoginDto> login = hibernateTemplate.find("from LoginDto l where l.emailId=?", email);

		return login;
	}


}
