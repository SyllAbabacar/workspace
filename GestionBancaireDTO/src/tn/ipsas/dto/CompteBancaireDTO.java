package tn.ipsas.dto;

import java.io.Serializable;


public class CompteBancaireDTO implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long rip;
	private float solde;
	private ClientBanqueDTO client;
	
	public CompteBancaireDTO() {
     	
	}
	public long getRip() {
		return rip;
	}
	public void setRip(long rip) {
		this.rip = rip;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public ClientBanqueDTO getClient() {
		return client;
	}
	public void setClient(ClientBanqueDTO client) {
		this.client = client;
	}

	
	
}
