<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="tn.ipsas.dto.ClientBanqueDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="AjoutCBServelet" method="post">
			<table>
				<tr>
					<td>Solde</td>
					<td><input type="text" name="solde" /></td>
				</tr>
				<tr>
					<td>Liste des clients</td>
					<td><select name="client">
							<%
								ArrayList<ClientBanqueDTO> listecb = (ArrayList<ClientBanqueDTO>) session
										.getAttribute("listClientBancaire");
								for (ClientBanqueDTO e : listecb) {
							%>
							<option value="<%=e.getCin()%>"><%=e.getNom()%>
								<%=e.getPrenom()%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
				<tr>
					<td><input type="submit" value="Ajouter CompteBancaire"
						name="valider" /></td>
				</tr>
			</table>
		</form>
	</div>
	<br />
	<br />
	<br />
	<p align="center">
		<a href="ajoutcb.jsp?'"><button value="Ajouter">Ajouter
				un nouveau Client</button></a>
	</p>