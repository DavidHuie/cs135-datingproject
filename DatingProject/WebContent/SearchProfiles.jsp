<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Profiles</title>
</head>
<body>
<h1>Search by name</h1><br />
<form acion ="SearchServlet">
<input type = "text" name = "query">
<input type ="submit" value = Search>
<input type = "hidden" name = "searchtype" id ="searchtype" value ="name" />
</form>
<br /> 
<br />
<h2>Search for users matching my description</h2>
<form action="SearchServlet">
<input type = "hidden" name = "searchtype" value ="match" />
<input type = "submit" value ="Find my soul mate" /> 
</form>
<br />
<br />
<h3>Search Random user</h3>
<form action = "SearchServlet">
<input type = "hidden" name = "searchtype" value = "random" />
<input type ="submit" value ="I'm getting lucky" />
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
<br />
<br />

<jsp:useBean id ="ResultsProfile2" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>
<br />
<br />

<jsp:useBean id ="ResultsProfile3" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>

<jsp:useBean id ="ResultsProfile4" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>
<br />
<br />

<jsp:useBean id ="ResultsProfile5" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>
<br />
<br />

<jsp:useBean id ="ResultsProfile6" class = "Beans.ProfileBean" scope = "page" />
<jsp:getProperty name = "ResultsProfile1" property = "username" /><br />
<form action = ViewProfileServlet">
<input type = "hidden" name = "username" value = <jsp:getProperty name = "Profile1" property = "username" /> />
<input type = "submit" value = "View Profile" />
</form>
<br />
<br />


</body>
</html>