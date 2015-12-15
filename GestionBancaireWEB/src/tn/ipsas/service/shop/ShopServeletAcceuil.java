package tn.ipsas.service.shop;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopServeletAcceuil
 */
public class ShopServeletAcceuil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopServeletAcceuil() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("ajout")!=null){
			response.sendRedirect("shop.html");
		}
		if(request.getParameter("liste")!=null){
			response.sendRedirect("ShopServelet");
		}
		if(request.getParameter("supprimer")!=null){
			response.sendRedirect("suppProduit.html");
		}
	}

}
