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

<%@ page import="java.util.*, coreservlets.*, Beans.*, Keywords.*" %>

<h2>Search by Name</h2><br />
<form action ="SearchServlet" method="post">
<input type = "text" name = "query">
<input type ="submit" value = Search>
<input type ="hidden" name="searchtype" value="name" />
</form>

<h2>Find Matches</h2><br />
<form action ="SearchServlet" method="post">
I'm looking for a
<select name="sex">
<option value="<%=Keywords.male%>"><%=Keywords.male%></option>
<option value="<%=Keywords.female%>"><%=Keywords.female%></option>
</select>
that is
<select name="orientation">
<option value="<%=Keywords.straight%>"><%=Keywords.straight%></option>
<option value="<%=Keywords.gay%>"><%=Keywords.gay%></option>
</select>
<input type ="submit" value = Search>
<input type ="hidden" name="searchtype" value="match" />
</form>



 
 <h2>Results</h2><br />
 
<% 	ServletConfig sconfig = getServletConfig();
	ServletContext scontext = sconfig.getServletContext();
 
	ArrayList<ProfileBean> results = (ArrayList<ProfileBean>) scontext.getAttribute("search_results");
	
	if (results == null) {
		out.println("<b>No search results.</b>");
	} else if (results.size() == 0){
		out.println("<b>No search results.</b>");
	} else {
		out.println("<table border=\"1\">");
	
		for (Iterator<ProfileBean> i = results.listIterator(); i.hasNext();) {
			ProfileBean profile = i.next();
			String username = profile.getUsername();
			
			String profile_link = "<form action =\"ViewProfileServlet\" method=\"post\">" + 
			  "<input type=\"hidden\" name=\"username\" value=\"" + username + "\">" + 
			  "<input type =\"submit\" value = \"View Profile\">" + 
			  "</form>";
			  
			String list = "<td><ul>" + "<li>Name: " + profile.getFullname() + "</li>" +
								   "<li>Sex: " + profile.getSex() + "</li>" +
								   "<li>Age: " + profile.getAge() + "</li>" +
								   "<li>College: " + profile.getCollege() + "</li>" + 
								   "<li>Description: " + profile.getDescription() + "</li>" + 
								   "<li>" + profile_link + "</li>" + "</ul></td>";
			
			out.println("<tr>" + list + "</tr>");
		}
		out.println("</table>");
	}
%>
<br/>
<a href ="homePage.jsp">main page</a><br />
<a href ="LogoutServlet">log out</a>
<a href = "HomeServlet">Home</a><br />
<a href = "LogoutServlet">Log Out</a>
</body>
</html>