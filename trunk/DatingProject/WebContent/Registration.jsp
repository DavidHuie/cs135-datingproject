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
<br>
<br>
Choose A User Name and Password
<br />
<br />
<form action = "/RegistrationServlet" method = "post">
User Name:<input type = "text" name = "UserName"><br />
Password:<input type = "text" name = "Password">
<input type = "hidden" name = "RequestType" value = "Registration">
</form>
</body>
</html>