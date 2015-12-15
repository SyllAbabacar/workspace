package tn.ipsas.service.calc.bean;

import javax.ejb.Remote;

@Remote
public interface CalculatriceRemote {
	double som(double x ,double y);
	double mul(double x ,double y);
	double sous(double x ,double y);

}
