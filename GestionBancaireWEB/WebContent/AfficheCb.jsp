<% if(session.getAttribute("listCompteBancaire") == null)
{
	RequestDispatcher dispatcher = request.getRequestDispatcher("ServiceServelet?listerCompte=ListerCompteBancaire");
	dispatcher.forward(request, response);
}
	%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tn.ipsas.dto.CompteBancaireDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table border="2">
			<thead>
				<tr align="center" bordercolor="GREEN">
					<th>Cin</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Solde</th>
				</tr>
			</thead>
			<tbody align="center">
				<%
					ArrayList<CompteBancaireDTO> listecb = (ArrayList<CompteBancaireDTO>) session.getAttribute("listCompteBancaire");
				int i=0;
				 String couleur="green"; 	
				for (CompteBancaireDTO e : listecb) {
					if((i%2)!=0)
						couleur="#4BB5C1";
					else
						couleur="#EDF7F2";
					i++;
				%>
				<form action="ServiceCompteBancaire" method="post">
					<input type="hidden" value="<%=e.getRip()%>" name="rib" /> <input
						type="hidden" value="<%=e.getClient().getCin()%>" name="cin" />
					<tr align="center" bordercolor="BLUE"
						style="text-align:center; background-color:<%=couleur%>">
						<td><%=e.getClient().getCin()%></td>
						<td><%=e.getClient().getNom()%></td>
						<td><%=e.getClient().getPrenom()%></td>
						<td><%=e.getSolde()%></td>
						<td><input type='submit' value="supprimer" name="supprimer" /></td>
						<td><input type='submit' value="modifier" name="modifier" /></td>
					</tr>
				</form>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>