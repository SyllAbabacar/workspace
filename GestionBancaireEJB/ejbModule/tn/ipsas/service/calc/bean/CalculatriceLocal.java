package tn.ipsas.service.calc.bean;

import javax.ejb.Local;

@Local
public interface CalculatriceLocal {
	double som(double x ,double y);
	double mul(double x ,double y);
	double sous(double x ,double y);

}
