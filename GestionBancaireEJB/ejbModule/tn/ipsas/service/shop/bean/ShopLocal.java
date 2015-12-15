package tn.ipsas.service.shop.bean;

import javax.ejb.Local;

@Local
public interface ShopLocal {
	 void achatProduit(String produit,  int quantite, double prix); //ajout au caddie 
	 String listProduitAchete(); //retourne la liste des produits achet�s 
      boolean suppressionProduit(int produit) ;//supprime un produit du caddie 
	 double getTotal(); // retourne le prix des produits dans le caddie  (utiliser les m�thodes offertes par l�EJB inject� Calculatrice); 
	 void payement(long rib); // affiche un message de r�ussite du payement  du total 


}
