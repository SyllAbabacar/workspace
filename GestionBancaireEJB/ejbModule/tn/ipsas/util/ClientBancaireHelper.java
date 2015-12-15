package tn.ipsas.util;

import java.util.ArrayList;

import tn.ipsas.dto.ClientBanqueDTO;
import tn.ipsas.model.ClientBanque;

public class ClientBancaireHelper {

	public static ClientBanque dtoToModel(ClientBanqueDTO clientdto) {
		ClientBanque model = new ClientBanque();
		model.setCin(clientdto.getCin());
		model.setNom(clientdto.getNom());
		model.setPrenom(clientdto.getPrenom());
		return model;
	}

	public static ClientBanqueDTO modelToDto(ClientBanque client) {
		ClientBanqueDTO model = new ClientBanqueDTO();
		model.setCin(client.getCin());
		model.setNom(client.getNom());
		model.setPrenom(client.getPrenom());
		return model;
	}
	public static ArrayList<ClientBanqueDTO> listModelToDto(
			ArrayList<ClientBanque> listcb) {
		ArrayList<ClientBanqueDTO> listcbdto = new ArrayList<ClientBanqueDTO>();
		if (listcb != null) {
			for (ClientBanque cb : listcb) {
				listcbdto.add(modelToDto(cb));
			}
		}
		return listcbdto;
	}
	
}
