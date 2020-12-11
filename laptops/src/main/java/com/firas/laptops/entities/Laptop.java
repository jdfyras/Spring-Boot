package com.firas.laptops.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLaptop;
	private String nomLaptop;
	private Double prixLaptop;
	private Date dateCreation;
	public Laptop() {
		super();
	}
	public Laptop(String nomLaptop, Double prixLaptop, Date dateCreation) {
		super();
		this.nomLaptop = nomLaptop;
		this.prixLaptop = prixLaptop;
		this.dateCreation = dateCreation;
	}
	public Long getIdLaptop() {
		return idLaptop;
	}
	public void setIdLaptop(Long idLaptop) {
		this.idLaptop = idLaptop;
	}
	public String getNomLaptop() {
		return nomLaptop;
	}
	public void setNomLaptop(String nomLaptop) {
		this.nomLaptop = nomLaptop;
	}
	public Double getPrixLaptop() {
		return prixLaptop;
	}
	public void setPrixLaptop(Double prixLaptop) {
		this.prixLaptop = prixLaptop;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Laptop [idLaptop=" + idLaptop + ", nomLaptop=" + nomLaptop + ", prixLaptop=" + prixLaptop
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	
}
