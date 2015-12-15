package tn.ipsas.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.ipsas.dto.ClientBanqueDTO;
import tn.ipsas.dto.CompteBancaireDTO;
import tn.ipsas.service.ClientBancaireServiceRemote;
import tn.ipsas.service.CompteBancaireServiceRemote;

/**
 * Servlet implementation class ServiceServelet
 */
public class ServiceServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	CompteBancaireServiceRemote compteBancaireService;
	@EJB
	ClientBancaireServiceRemote clientBanque;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServiceServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = null;
		if (request.getParameter("listerCompte") != null
				&& (request.getParameter("listerCompte").equalsIgnoreCase(
						"Lister les compteBancaire") || request.getParameter(
						"listerCompte")
						.equalsIgnoreCase("ListerCompteBancaire"))) {
			ArrayList<CompteBancaireDTO> listecb = compteBancaireService
					.listDesComptes();
			session = request.getSession();
			session.setAttribute("listCompteBancaire", listecb);
			response.sendRedirect("AfficheCb.jsp");
		}
		if (request.getParameter("ajoutercompte") != null
				&& request.getParameter("ajoutercompte").equalsIgnoreCase(
						"Ajouter CompteBancaire")) {
			ArrayList<ClientBanqueDTO> listecl = clientBanque.listDesComptes();
			session = request.getSession();
			session.setAttribute("listClientBancaire", listecl);
			response.sendRedirect("ajoutCompteBancaire.jsp");
		}
	}

}
