package com.example.dao;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.client;

public interface IClientRepository extends MongoRepository<client, String> {
	public List<client> findByCode(int code) ;
	public Page<client> findByCode(int code, Pageable P);
	public void deleteByCode(int code); 

	
	
}
