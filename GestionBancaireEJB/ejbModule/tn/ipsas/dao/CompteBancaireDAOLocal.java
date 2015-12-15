package tn.ipsas.dao;

import java.util.ArrayList;

import javax.ejb.Local;

import tn.ipsas.model.CompteBancaire;

@Local
public interface CompteBancaireDAOLocal {
	void save(CompteBancaire compteBancaire);

	void remove(CompteBancaire compteBancaire);

	CompteBancaire getById(long rip);
	
	ArrayList<CompteBancaire> getByCin(String cin);
	void update(CompteBancaire compteBancaire);

	ArrayList<CompteBancaire> getAll();
}
