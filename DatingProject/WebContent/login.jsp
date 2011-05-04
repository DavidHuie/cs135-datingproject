<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login below</h1>
<form action="LoginServlet" method="post">
User Name: <input type="text" name="username" /><br/>
Password: <input type="password" name="password" /><br/>
<input type="submit" value= "Log In">
</form><br /><br />
<%@ taglib uri="WEB-INF/tlds/csajsp-taglib.tld" 
prefix="csajsp" %>

<csajsp:terror>
<p>
Login Failed. Please Try again.
</p>
</csajsp:terror>

</body>
</html>