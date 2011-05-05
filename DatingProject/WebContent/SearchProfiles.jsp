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
<form action ="SearchServlet" method="post">
<input type = "text" name = "query">
<input type ="submit" value = Search>
<input type ="hidden" name="searchtype" value="name" />
</form>

<%@ page import="java.util.*, coreservlets.*, Beans.*" %>
 
 <h1>Results</h1><br />
 
<% 	ServletConfig sconfig = getServletConfig();
	ServletContext scontext = sconfig.getServletContext();
 
	ArrayList<ProfileBean> results = (ArrayList<ProfileBean>) scontext.getAttribute("search_results");
	
	if (results == null) {
		out.println("<b>No search results.</b>");
	} else {
		out.println("<table border=\"1\">");
	
		for (Iterator<ProfileBean> i = results.listIterator(); i.hasNext();) {
			ProfileBean profile = i.next();
			String list = "<td><ul>" + "<li>Name: " + profile.getFullname() + "</li>" +
								   "<li>Sex: " + profile.getSex() + "</li>" +
								   "<li>Age: " + profile.getAge() + "</li>" +
								   "<li>College: " + profile.getCollege() + "</li>" + 
								   "<li>Description: " + profile.getDescription() + "</li>" + "</ul></td>";
			out.println("<tr>" + list + "</tr>");
		}
		out.println("</table>");
	}
%>



</body>
</html>