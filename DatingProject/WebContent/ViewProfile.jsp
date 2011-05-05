<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
</head>
<body>
<jsp:useBean id ="currentProfile" type = "Beans.ProfileBean" scope = "application" />
<h1>Profile Viewer</h1>

<h3><jsp:getProperty name = "currentProfile" property = "fullname" /></h3>
<ul>
<li><b>user name: </b><jsp:getProperty name = "currentProfile" property = "username" /></li>
<li><b>email: </b><jsp:getProperty name = "currentProfile" property = "email" /></li>
<li><b>age: </b><jsp:getProperty name = "currentProfile" property = "age" /></li>
<li><b>birthday: </b><jsp:getProperty name = "currentProfile" property = "birthmonth" /> - 
<jsp:getProperty name = "currentProfile" property = "birthday" /> -
<jsp:getProperty name = "currentProfile" property = "birthyear" /></li>
<li><b>class year: </b><jsp:getProperty name = "currentProfile" property = "classyear" /></li>
<li><b>sex: </b><jsp:getProperty name = "currentProfile" property = "sex" /></li>
<li><b>orientation: </b><jsp:getProperty name = "currentProfile" property = "orientation" /></li>
<li><b>status: </b><jsp:getProperty name = "currentProfile" property = "status" /></li>
<li><b>seeking: </b><jsp:getProperty name = "currentProfile" property = "seeking" /></li>
<li><b>college: </b>b<jsp:getProperty name = "currentProfile" property = "college" /></li>
<li><b>dorm: </b><jsp:getProperty name = "currentProfile" property = "dorm" /></li>
<li><b>description: </b><jsp:getProperty name = "currentProfile" property = "description" /></li>
<li><b>activities: </b><jsp:getProperty name = "currentProfile" property = "activities" /></li>
</ul>
<br />
<b>Send a message to this user:</b>
<form action = "SendMessageServlet">
<textarea  name="message_body"></textarea>
<input type="hidden" name="recipient" value="<jsp:getProperty name = "currentProfile" property = "username" />">
<input type = "submit" value = "send">
</form>
<a href = "index.html">index</a><br />
<a href = "LogoutServlet">log out</a>

</body>
</html>