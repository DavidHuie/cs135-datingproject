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

<h3>${currentProfile.fullname}</h3>
<ul>
<li><b>user name: </b>${currentProfile.username}</li>
<li><b>email: </b>${currentProfile.email}</li>
<li><b>age: </b>${currentProfile.age}</li>
<li><b>birthday: </b><jsp:getProperty name = "currentProfile" property = "birthmonth" /> - 
<jsp:getProperty name = "currentProfile" property = "birthday" /> -
<jsp:getProperty name = "currentProfile" property = "birthyear" /></li>
<li><b>class year: </b>${currentProfile.classyear}</li>
<li><b>sex: </b>${currentProfile.sex}</li>
<li><b>orientation: </b>${currentProfile.orientation}</li>
<li><b>status: </b>${currentProfile.status}</li>
<li><b>seeking: </b>${currentProfile.seeking}</li>
<li><b>college: </b>${currentProfile.college}</li>
<li><b>dorm: </b>${currentProfile.dorm}</li>
<li><b>description: </b>${currentProfile.description}</li>
<li><b>activities: </b>${currentProfile.activities}</li>
</ul>
<br />
<b>Send a message to this user:</b>
<form action = "SendMessageServlet">
<textarea  name="message_body"></textarea>
<input type="hidden" name="recipient" value="<jsp:getProperty name = "currentProfile" property = "username" />">
<input type = "submit" value = "send">
</form>

<a href = "homePage.jsp">main page</a><br />
<a href = "LogoutServlet">log out</a>

</body>
</html>