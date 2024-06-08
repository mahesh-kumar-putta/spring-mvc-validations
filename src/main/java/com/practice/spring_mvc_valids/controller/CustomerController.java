package com.practice.spring_mvc_valids.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.spring_mvc_valids.dto.Customer;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
	
	@InitBinder
	public void filterThings(WebDataBinder webDataBinder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, editor);
	}

	@GetMapping("/")
	public String getForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "customer-form";
	}
	
	@PostMapping("processForm")
	public String validForm( @Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		System.out.println("last name is | "+customer.getLastName());
		if(bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
