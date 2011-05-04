<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
</head>
<body>

<%@ taglib uri="WEB-INF/tlds/csajsp-taglib.tld" 
prefix="csajsp" %>

<h1>Welcome to Claremont Cupid <csajsp:printName />!</h1>

	Browse around...<br />
	
	Edit your profile <a href="EditProfile.jsp">here!</a><br />
	Check out your profile <a href="ViewProfile.jsp">here!</a><br />
	Check out other people's profile <a href="SearchProfiles.jsp">here!</a><br />
  	<br>
  	<a href="LogoutServlet">Log out.</a>
</body>
</html>