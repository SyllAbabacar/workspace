package tn.ipsas.service.cal;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.ipsas.service.calc.bean.CalculatriceLocal;

/**
 * Servlet implementation class CalculServelet
 */
public class CalculServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	CalculatriceLocal cal ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   Double x = Double.parseDouble(request.getParameter("A"));
		   Double y = Double.parseDouble(request.getParameter("B"));
		   Double result = cal.som(x, y);
		   HttpSession session = request.getSession();
		   session.setAttribute("resultat",result);
		   response.sendRedirect("afficheResult.jsp");
	}

}
