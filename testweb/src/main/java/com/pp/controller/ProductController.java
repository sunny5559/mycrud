package com.pp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.pp.model.ProductDto;
import com.pp.repository.Productrepo;
import com.pp.service.ProductService;
import com.pp.validator.ProductValidator;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	@Autowired
	ProductValidator productv;
	
	


	 @RequestMapping("/product") 
	 public String registration(Map<String,Object> map )
	 { 
      map.put("product", new ProductDto());
      
  	
  	List<ProductDto> productlist =	productservice.getProduct();
  		
  		
  	     map.put("listofProduct", productlist);
	 
	  System.out.println("product page");
	  return "product";
	  }
	  

	
	@RequestMapping(value="/showproduct" , method = RequestMethod.POST)
	public String submitregister(@ModelAttribute("product")  ProductDto productdto, BindingResult result,Map<String,Object> map)
	{
		
		
		productv.validate(productdto, result);
	
		
		if(result.hasErrors())
		{

			List<ProductDto> productlist =	productservice.getProduct();
			
			
			 map.put("listofProduct", productlist);
			
			System.out.println("data is fetching successfully...");
			
			return "product";
			
		}
		
	
		
		else {
		  
		productservice.saveService(productdto);
		

		List<ProductDto> productlist =	productservice.getProduct();
		
		
		 map.put("listofProduct", productlist);
		
		System.out.println("data is fetching successfully...");
		
	
		return "product";
		 
	
		}
		

	}
	
	
	
}
