package tn.ipsas.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import tn.ipsas.dto.CompteBancaireDTO;

@WebService
@javax.jws.soap.SOAPBinding(style = javax.jws.soap.SOAPBinding.Style.RPC) 
public interface CompteBancaireServiceWS  {
	@WebMethod
	void ajoutCompteBancaire(CompteBancaireDTO compteBancaireDTO);
	@WebMethod
	ArrayList<CompteBancaireDTO> listDesComptes();

}
