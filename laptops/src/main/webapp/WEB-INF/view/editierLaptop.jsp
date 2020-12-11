<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Modifier un Laptop</title>
</head>
<body>
<form action="updateLaptop" method="post">
<pre>
id : <input type="text" name="idLaptop" value="${laptop.idLaptop}">
nom :<input type="text" name="nomLaptop" value="${laptop.nomLaptop}">
prix :<input type="text" name="prixLaptop" value="${laptop.prixLaptop}">
Date création :
 <fmt:formatDate pattern="yyyy-MM-dd" value="${laptop.dateCreation}"
var="formatDate" />
 <input type="date" name="date" value="${formatDate}"></input>
<input type="submit" value="Modifier">
</pre>
</form>
<br/>
<br/>
<a href="ListeLaptops">Liste Laptops</a>
</body>
</html>