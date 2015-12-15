package tn.ipsas.service;

import java.util.ArrayList;

import javax.ejb.Local;

import tn.ipsas.dto.ClientBanqueDTO;

@Local
public interface ClientBancaireServiceLocal {
	void ajoutClientBancaire(ClientBanqueDTO clientDTO);

	boolean supprimerClient(String cin);

	ArrayList<ClientBanqueDTO> listDesComptes();

	ClientBanqueDTO getClientBancaire(String cin);

	void update(ClientBanqueDTO dto);
}
