<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
</head>
<body>
Welcome to your profile.

<jsp:useBean id ="currentProfile" type = "Beans.ProfileBean" scope = "application" />
<jsp:getProperty name = "currentProfile" property = "username" /><br />
<jsp:getProperty name = "currentProfile" property = "fullname" /><br />
<jsp:getProperty name = "currentProfile" property = "email" /><br />
<jsp:getProperty name = "currentProfile" property = "age" /><br />
<jsp:getProperty name = "currentProfile" property = "birthmonth" /><br />
<jsp:getProperty name = "currentProfile" property = "birthday" /><br />
<jsp:getProperty name = "currentProfile" property = "birthyear" /><br />
<jsp:getProperty name = "currentProfile" property = "classyear" /><br />
<jsp:getProperty name = "currentProfile" property = "sex" /><br />
<jsp:getProperty name = "currentProfile" property = "orientation" /><br />
<jsp:getProperty name = "currentProfile" property = "status" /><br />
<jsp:getProperty name = "currentProfile" property = "seeking" /><br />
<jsp:getProperty name = "currentProfile" property = "college" /><br />
<jsp:getProperty name = "currentProfile" property = "dorm" /><br />
<jsp:getProperty name = "currentProfile" property = "description" /><br />
<jsp:getProperty name = "currentProfile" property = "activities" /><br />



</body>
</html>