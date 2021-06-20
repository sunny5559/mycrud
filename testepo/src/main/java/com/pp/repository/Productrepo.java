package com.pp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.LoginDto;
import com.pp.model.ProductDto;

@Repository
public class Productrepo {

	@Autowired
	HibernateTemplate hibernateTamplate;
	
	
	
	public void  saveProduct(ProductDto productdto)
	{
		System.out.println("inside product repo");
		       
		
	         hibernateTamplate.save(productdto); 
	    
	      System.out.println("Product details saved sucessfully....");      
	
	}
	
	
	public List<ProductDto> fetching()
	{
		
		System.out.println("inside FetchProduct");
		
		List<ProductDto> product = hibernateTamplate.find("from ProductDto pd");
		
		for(ProductDto productDto:product)
			
		{
			
			System.out.println("inside ptoductFetchMethod");
			
			System.out.println(productDto.getPname());
			
			System.out.println(productDto.getPdescription());
			
			System.out.println(productDto.getpDate());
			
			System.out.println(productDto.getpExpiry());
			
			System.out.println(productDto.getRating());
		}
		return product;
		
		
	}
	
	
}