package tn.ipsas.service.shop.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.ipsas.service.shop.bean.ShopRemote;


public class Client {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
     
		InitialContext ctx = new InitialContext() ; // lecture du fichier jndi
	      ShopRemote shop1 = (ShopRemote) ctx.lookup("Shop/remote");
	      shop1.achatProduit("Ordinateur",3, 1000);
	      shop1.achatProduit("Imprimante",2, 500);
	      shop1.achatProduit("Ipad",1, 600);
	      System.out.println(shop1.listProduitAchete());
	      System.out.println("\nTOTAL ="+shop1.getTotal() );
	      //shop1.payement(4600);
	}

}
