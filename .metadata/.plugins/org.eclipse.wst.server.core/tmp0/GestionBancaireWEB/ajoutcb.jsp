<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="tn.ipsas.dto.CompteBancaireDTO"%>
<%!long solde;
	String nomClient = "";
	String prenomClient = "";
	String cinClient = "";
	long rib;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><%if (session.getAttribute("dto") != null) { %><%="Modifier"%>
						<%} else {%><%="Ajouter"%> <%}%></title>
</head>
<body>
	<div align="center">
		<form action="AjoutCBServelet" method="post">
			<table>
				<%
					if (session.getAttribute("dto") != null) {
						CompteBancaireDTO dto = (CompteBancaireDTO) session
								.getAttribute("dto");
						solde = (long) dto.getSolde();
						nomClient = dto.getClient().getNom();
						prenomClient = dto.getClient().getPrenom();
						cinClient = dto.getClient().getCin();
						rib = (long) dto.getRip();
				%>
				<input type="hidden" name="rib" value="<%=rib%>" />
				<%
					}
				%>

				<tr>
					<td>Solde</td>
					<td><input type="text" name="solde" value="<%=solde%>" /></td>
				</tr>

				<input type="hidden" name="cinClient" value="<%=cinClient%>" />

				<tr>
					<td>Nom</td>
					<td><input type="text" name="nomClient" value="<%=nomClient%>" /></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><input type="text" name="prenomClient"
						value="<%=prenomClient%>" /></td>
				</tr>

				<tr>
					<td><input type="submit"
						<%if (session.getAttribute("dto") != null) {%> value="Valider"
						<%} else {%> value="Ajouter" <%}%> name="valider" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>