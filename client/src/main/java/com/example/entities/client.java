package com.example.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="client")
public class client implements Serializable {
	
	public int code;
	public String nom;
	public String prenom;
	public Date Date_naissance;
	
	
	
	
	
	public client(int code, String nom, String prenom, Date date_naissance) {
		super();
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		Date_naissance = date_naissance;
	}
	
	public client(String nom, String prenom, Date date_naissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Date_naissance = date_naissance;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return Date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		Date_naissance = date_naissance;
	}
	

}
