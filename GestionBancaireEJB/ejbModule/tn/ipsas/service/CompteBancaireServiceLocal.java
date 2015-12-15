package tn.ipsas.service;

import java.util.ArrayList;

import javax.ejb.Local;

import tn.ipsas.dto.CompteBancaireDTO;

@Local
public interface CompteBancaireServiceLocal {
	void ajoutCompteBancaire(CompteBancaireDTO compteBancaireDTO);

	boolean supprimerCompteBancaire(long rib);

	ArrayList<CompteBancaireDTO> listDesComptes();
	boolean listDesComptes(String cin);
	CompteBancaireDTO getCompteBancaire(long rib);
	void update(CompteBancaireDTO dto);
}
