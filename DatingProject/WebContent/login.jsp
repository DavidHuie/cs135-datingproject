<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login below</h1>

<form action="LoginServlet" method="post">
User Name: <input type="text" name="username"><br/>
Password: <input type="password" name="password"><br/>
<input type="submit" value= "Log In">
</form>
<%@ taglib uri="/WEB-INF/tlds/csajsp-taglib.tld" 
prefix="csajsp" %>
Hi Everybody<br /> <br />
<csajsp:terror>
<p>
Login Failed. Please Try again.
</p>
</csajsp:terror>

</body>
</html>