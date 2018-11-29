package com.example.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.dao.IClientRepository;
import com.example.entities.client;

@RestController
public class ClientController {
	@Autowired
	private IClientRepository clientReposi;
	
	@RequestMapping("/save")
	public client saveClient(client c) {
		clientReposi.save(c);
		return c;	
	}
	
	@RequestMapping("/all")
	public List<client> findAll() {
		
		return clientReposi.findAll();	
	}
	
	@RequestMapping("/get")
	public Collection<client> getProduit(int code)
	{
		return clientReposi.findByCode(code);
	}
	

	
	@RequestMapping("/delete/{code}")
	public boolean delete(@PathVariable String code)
	{ 
		clientReposi.deleteById(code); return true; 
	}
	@RequestMapping("/update")
	public client update(client c)
	{	
		clientReposi.save(c);
		return c; 
	}
}
