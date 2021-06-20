package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.ProductDto;
import com.pp.repository.Productrepo;

@Service
public class ProductService {

	@Autowired
	Productrepo productrepo;
	
	public void saveService(ProductDto productdto)
	{
		
		System.out.println("inside product Service");
		
		System.out.println(productdto.getPname());
		System.out.println(productdto.getPdescription());
		System.out.println(productdto.getpDate());
		System.out.println(productdto.getpExpiry());
		System.out.println(productdto.getRating());
		
		productrepo.saveProduct(productdto);
		
		
	}
	
	public List<ProductDto> getProduct()
	{
		System.out.println("fetching data inside service");
		List<ProductDto> product=productrepo.fetching();
		return product;
		
		
	}
	
	
	

}
