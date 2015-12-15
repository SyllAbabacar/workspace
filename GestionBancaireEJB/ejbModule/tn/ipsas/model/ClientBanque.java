package tn.ipsas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name = "allComptesClient", query = "select object(c) from  ClientBanque c")
public class ClientBanque implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String cin;
	private String nom;
	private String prenom;
	@OneToMany(mappedBy="client")
	List<CompteBancaire> comtes= new ArrayList<CompteBancaire>();
	
	public ClientBanque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ClientBanque(String cin, String nom, String prenom) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public List<CompteBancaire> getComtes() {
		return comtes;
	}
	public void setComtes(List<CompteBancaire> comtes) {
		this.comtes = comtes;
	}

	
	
	
	

}