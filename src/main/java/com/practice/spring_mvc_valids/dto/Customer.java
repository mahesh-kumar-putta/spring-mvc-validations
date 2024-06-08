package com.practice.spring_mvc_valids.dto;

import com.practice.spring_mvc_valids.validations.CourseCode;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message="Cannot be empty")
	@Size(min=1, message="Cannot be empty")
	private String lastName;
	
	@CourseCode
	private String course;
	

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
