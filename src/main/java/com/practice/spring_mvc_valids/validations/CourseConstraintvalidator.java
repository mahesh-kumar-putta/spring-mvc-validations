package com.practice.spring_mvc_valids.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseConstraintvalidator implements ConstraintValidator<CourseCode, String>{

	private String prefix;
	
	@Override
	public void initialize(CourseCode constraint) {
		prefix = constraint.prefix();
	}
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value.startsWith(prefix);
	}

}
