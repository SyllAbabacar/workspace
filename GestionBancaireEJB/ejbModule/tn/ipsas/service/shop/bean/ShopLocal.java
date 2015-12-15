package tn.ipsas.service.shop.bean;

import javax.ejb.Local;

@Local
public interface ShopLocal {
	 void achatProduit(String produit,  int quantite, double prix); //ajout au caddie 
	 String listProduitAchete(); //retourne la liste des produits achetés 
      boolean suppressionProduit(int produit) ;//supprime un produit du caddie 
	 double getTotal(); // retourne le prix des produits dans le caddie  (utiliser les méthodes offertes par l’EJB injecté Calculatrice); 
	 void payement(long rib); // affiche un message de réussite du payement  du total 


}
