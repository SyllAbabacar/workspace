package tn.ipsas.util;

import java.util.ArrayList;

import tn.ipsas.dto.ClientBanqueDTO;
import tn.ipsas.dto.CompteBancaireDTO;
import tn.ipsas.model.ClientBanque;
import tn.ipsas.model.CompteBancaire;

public class CompteBancaireHelper {

	public static CompteBancaire dtoToModel(CompteBancaireDTO compteBancaireDTO) {
		CompteBancaire model = new CompteBancaire();
		ClientBanque modelClient = new ClientBanque();
		modelClient = ClientBancaireHelper.dtoToModel(compteBancaireDTO
				.getClient());
		model.setClient(modelClient);
		model.setSolde(compteBancaireDTO.getSolde());
		return model;
	}

	public static CompteBancaireDTO modelTodto(CompteBancaire cb) {
		CompteBancaireDTO dto = new CompteBancaireDTO();
		ClientBanqueDTO clientDTO = new ClientBanqueDTO();
		dto.setRip(cb.getRip());
		clientDTO = ClientBancaireHelper.modelToDto(cb.getClient());
		dto.setClient(clientDTO);
		dto.setSolde(cb.getSolde());
		return dto;
	}

	public static ArrayList<CompteBancaireDTO> listModelToDto(
			ArrayList<CompteBancaire> listcb) {
		ArrayList<CompteBancaireDTO> listcbdto = new ArrayList<CompteBancaireDTO>();
		if (listcb != null) {
			for (CompteBancaire cb : listcb) {
				listcbdto.add(modelTodto(cb));
			}
		}
		return listcbdto;
	}
}
