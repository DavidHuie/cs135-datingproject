<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h1>Register Here</h1>
<%@ taglib uri ="WEB-INF/tlds/csajsp-taglib.tld" 
prefix = "cupid" %>
<br>Choose A User Name and Password<br/>
<form action = "RegistrationServlet" method = "post">
User Name:<input type = "text" name = "username"><br />
Password:<input type = "password" name = "password">
<input type = "hidden" name = "requesttype" value = "registration">
<input type = "submit" value = "Click Here to Register" />
</form><br />
<cupid:terror>
There already exists a user of that name,
please try another.
</cupid:terror>
</body>
</html>