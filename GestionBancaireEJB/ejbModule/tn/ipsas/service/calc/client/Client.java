package tn.ipsas.service.calc.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.ipsas.service.calc.bean.CalculatriceRemote;

public class Client {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		InitialContext ctx = new InitialContext() ; // lecture du fichier jndi
	      CalculatriceRemote cal = (CalculatriceRemote) ctx.lookup("Calculatrice/remote");
	      System.out.println(cal.som(4,2));
		   System.out.println(cal.mul(4,2));
		    System.out.println(cal.sous(4,2));
	}

}
