<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Créer un Laptop</title>
</head>
<body>
<form action="saveLaptop" method="post">
<pre>
nom : <input type="text" name="nomLaptop">
prix : <input type="text" name="prixLaptop">
date création : <input type="date" name="date">
<input type="submit" value="ajouter">
</pre>
</form>
${msg}
<br/>
<br/>
<a href="ListeLaptops">Liste Laptops</a>
</body>
</html>