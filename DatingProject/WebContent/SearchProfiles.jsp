<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Profiles</title>
</head>
<body>
<h1>Enter Search Terms</h1>
<form>
<input type = "text" name = "query">
</form>
<br /> 
<br />

Results:
<br />

<jsp:useBean id ="ResultsProfile1" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>



</body>
</html>