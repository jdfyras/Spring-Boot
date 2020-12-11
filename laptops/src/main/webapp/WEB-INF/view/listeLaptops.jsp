<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Liste Laptops</title>
</head>
<body>
 	<h1 >
 		Liste des Laptops
 	</h1>
	 <table >
	 	<tr>
		 	<th>ID</th><th>Nom Laptop</th><th>Prix</th><th>DateCréation</th><th>Suppression<th>Edition</th>
 	</tr>
	 <c:forEach items="${laptops}" var="l">
	 <tr>
	 <td>hello</td>
	 <td>${l.idLaptop }</td>
	 <td>${l.nomLaptop}</td>
	 <td>${l.prixLaptop }</td>
	 <td><fmt:formatDate pattern="dd/MM/yyyy" value="${l.dateCreation}" /></td>
 <td><a onclick="return confirm('Etes-vous sûr ?')"
href="supprimerLaptop?id=${l.idLaptop }">Supprimer</a></td>
 <td><a href="modifierLaptop?id=${l.idLaptop }">Edit</a></td>
 </tr>
 </c:forEach>
 </table>
</body>
</html>