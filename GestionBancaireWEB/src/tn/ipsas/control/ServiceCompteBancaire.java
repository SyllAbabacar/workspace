package tn.ipsas.control;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tn.ipsas.dto.CompteBancaireDTO;
import tn.ipsas.service.ClientBancaireServiceLocal;
import tn.ipsas.service.CompteBancaireServiceLocal;

/**
 * Servlet implementation class SupprimerCompte
 */
public class ServiceCompteBancaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	CompteBancaireServiceLocal compteBancaireService;
	@EJB
	ClientBancaireServiceLocal clientBanque;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServiceCompteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getParameter("supprimer") != null
				&& request.getParameter("supprimer").equalsIgnoreCase(
						"supprimer")) {
			long rib = Long.parseLong(request.getParameter("rib"));
			String cin = request.getParameter("cin");
			compteBancaireService.supprimerCompteBancaire(rib);
			if (compteBancaireService.listDesComptes(cin))
			{	
				clientBanque.supprimerClient(cin);
			}
			response.sendRedirect("ServiceServelet?listerCompte=ListerCompteBancaire");

		}
		if (request.getParameter("modifier") != null
				&& request.getParameter("modifier")
						.equalsIgnoreCase("modifier")) {
			long rib = Long.parseLong(request.getParameter("rib"));
			CompteBancaireDTO dto = compteBancaireService
					.getCompteBancaire(rib);
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			response.sendRedirect("ajoutcb.jsp");
		}

	}
}
