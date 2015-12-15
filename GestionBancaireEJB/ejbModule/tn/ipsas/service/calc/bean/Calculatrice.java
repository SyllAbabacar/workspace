package tn.ipsas.service.calc.bean;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculatrice
 */
@Stateless
public class Calculatrice implements CalculatriceRemote, CalculatriceLocal {

    /**
     * Default constructor. 
     */
    public Calculatrice() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public double som(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double mul(double x, double y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double sous(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

}
