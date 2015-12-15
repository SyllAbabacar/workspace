package tn.ipsas.service;

import java.util.ArrayList;

import javax.ejb.Remote;

import tn.ipsas.dto.ClientBanqueDTO;

@Remote
public interface ClientBancaireServiceRemote {
	void ajoutClientBancaire(ClientBanqueDTO clientDTO);

	boolean supprimerClient(String cin);

	ArrayList<ClientBanqueDTO> listDesComptes();

	ClientBanqueDTO getClientBancaire(String cin);

	void update(ClientBanqueDTO dto);
}
