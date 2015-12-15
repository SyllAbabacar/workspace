package tn.ipsas.service.shop;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.ipsas.service.shop.bean.ShopLocal;

/**
 * Servlet implementation class ShopServelet
 */
public class ShopServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	ShopLocal shop;
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String result=shop.listProduitAchete();
		HttpSession session = request.getSession();
		session.setAttribute("result", result);
		response.sendRedirect("vue_shop.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("produit")!=null && request.getParameter("quantite")!=null && request.getParameter("prix")!=null){
			String produit = request.getParameter("produit");
			int quantite = Integer.parseInt(request.getParameter("quantite"));
			double prix = Double.parseDouble(request.getParameter("prix"));
			 shop.achatProduit(produit, quantite, prix);
			}
			if(request.getParameter("supprimer")!=null){
				int id = Integer.parseInt(request.getParameter("id"));
				shop.suppressionProduit(id);
			}
			
			 response.sendRedirect("AcceuilShop.html");
			
	}

}
