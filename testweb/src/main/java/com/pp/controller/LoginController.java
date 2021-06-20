package com.pp.controller;

import java.util.Map;

import javax.imageio.spi.RegisterableService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.LoginDto;
import com.pp.model.ProductDto;
import com.pp.service.LoginServi;
import com.pp.service.RegistrationService;
import com.pp.validator.LoginValidator;

@Controller
public class LoginController {
	
	@Autowired
	LoginServi loginservi;
	
	@Autowired
	LoginValidator loginvali;
	

  
	@RequestMapping(value="/mergelogin" , method = {RequestMethod.POST ,RequestMethod.GET})
	public String submitLogin(@ModelAttribute("user") LoginDto logindto , HttpServletRequest  request , BindingResult result , ModelMap model)
	{
		
		String method = request.getMethod();
		
		if(method.equals("GET"))
		{
			System.out.println("inside mergelogin controller if section");
			model.addAttribute("user" , new LoginDto());
			return "login";
			
		}
		
		else
		{
		// for validation
			
		System.out.println("in merge login section...");	
			
		loginvali.validate(logindto, result);
		
		if(result.hasErrors())
		{
			return "login";
		}
		
		else
		{
	
			System.out.println("submit login else part");
		
	     LoginDto login =  loginservi.submittLogin(logindto);
		
	       	HttpSession session = request.getSession();
	       	session.setAttribute("login", login);
	       	
	       	System.out.println("checking session value");
	       	
	        System.out.println(session.getAttribute("login"));
 		
		     return "login";
		}
	}
	
	
	
	}
	
	

}
