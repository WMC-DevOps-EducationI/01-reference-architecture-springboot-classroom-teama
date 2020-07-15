<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Framework - Learning</title>
</head>
<body>
<font color="red">${errorMessage}</font>
<form method="post">
Name: <input type="text" name="name"/> <br/>
Password: <input type="password" name="password"/>
<input type = "submit"/> 
</form>
<br/>
<br/>
<!-- Welcome ${name!= null ? name : "no name"}-->

</body>
</html>