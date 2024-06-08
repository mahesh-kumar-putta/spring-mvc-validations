package com.practice.spring_mvc_valids.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CourseConstraintvalidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String prefix() default "COURSE";
	
	public String message() default "must start with COURSE";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
	
}
