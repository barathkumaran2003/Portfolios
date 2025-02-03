package com.example.Portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Portfolio.Reporsitory.contact_repository;
import com.example.Portfolio.entity.contact;

@Service
public class contact_service 
{
	@Autowired
	private contact_repository cRep;
	public void save(contact c)
	{
		 System.out.println("Saving contact: " + c);
		cRep.save(c);
	}

}
