package com.pp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.ProductDto;
@Component
public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ProductDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		ProductDto product = (ProductDto) target;
		
		
		ValidationUtils.rejectIfEmpty(errors, "pname","error.pname.empty");
		ValidationUtils.rejectIfEmpty(errors, "pdescription","error.pdescription.empty");
		ValidationUtils.rejectIfEmpty(errors, "pDate", "error.pDate.empty");
		ValidationUtils.rejectIfEmpty(errors, "pExpiry", "error.pExpiry.empty");
		ValidationUtils.rejectIfEmpty(errors, "rating","error.rating.empty");
	}

}
