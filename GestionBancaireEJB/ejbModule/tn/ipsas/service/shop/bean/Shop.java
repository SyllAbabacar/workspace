package tn.ipsas.service.shop.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Shop
 */
@Stateful
public class Shop implements ShopRemote, ShopLocal {

	/**
	 * Default constructor.
	 */
	List<String> listProduit;
	List<Integer> listQuantite;
	List<Double> listPrix;
	double total;

	@PostConstruct
	void creerShop() {
		System.out.println("Shop créer !!!!");
	}

	public Shop() {
		listProduit = new ArrayList<String>();
		listQuantite = new ArrayList<Integer>();
		listPrix = new ArrayList<Double>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void achatProduit(String produit, int quantite, double prix) {
		// TODO Auto-generated method stub
		listProduit.add(produit);
		listQuantite.add(quantite);
		listPrix.add(prix);
	}

	@Override
	public String listProduitAchete() {
		// TODO Auto-generated method stub
		String listeDesProduits = "<table>";
		for (int i = 0; i < listProduit.size(); i++) {
			listeDesProduits += "<tr><form action='ShopServelet' method='post' ><td>"
					+ listProduit.get(i)
					+ " ****  "
					+ listQuantite.get(i)
					+ " **** "
					+ listPrix.get(i)
					+ "<input type='hidden' name='id' value="+i+" />  <input type='submit' name='supprimer'  value='Supprimer'/></td></form></tr>";
		}
		listeDesProduits += "</table>";
		return listeDesProduits;
	}

	@Override
	public boolean suppressionProduit(int i) {
		// TODO Auto-generated method stub
		listProduit.remove(i);
		listQuantite.remove(i);
		listPrix.remove(i);
		return true;
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		double t = 0;
		for (int i = 0; i < listProduit.size(); i++) {
			t += listQuantite.get(i) * listPrix.get(i);
		}
		return t;
	}

	@Override
	public void payement(long rib) {
		// TODO Auto-generated method stub
		if (getTotal() == rib)
			System.out.println("Payement reussi");
		else
			System.out
					.println("Montant inférieur au prix  total des produits achetés ");
	}

}
