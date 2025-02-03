package com.example.Portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Portfolio.entity.contact;
import com.example.Portfolio.service.contact_service;

@Controller
public class contact_controller 
{
	@Autowired
	private contact_service cServ;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@PostMapping("/save")
	public String addcontact(@ModelAttribute contact c) {
		cServ.save(c);
		return "formsubmission";
	}
	@GetMapping("/hotel")
	public String hotel()
	{
		return "hotel";
	}
	@GetMapping("/portfolio")
	public String portfolio()
	{
		return "portfolio";
	}
	@GetMapping("/avt")
	public String avt()
	{
		return "avt";
	}

}
