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
<jsp:useBean id ="currentProfile" class = "Beans.ProfileBean" scope = application>
<jsp:getProperty name = "currentProfile" property = "username" />
<jsp:getProperty name = "currentProfile" property = "fullname" />
<jsp:getProperty name = "currentProfile" property = "email" />
<jsp:getProperty name = "currentProfile" property = "age" />
<jsp:getProperty name = "currentProfile" property = "birthmonth" />
<jsp:getProperty name = "currentProfile" property = "birthday" />
<jsp:getProperty name = "currentProfile" property = "birthyear" />
<jsp:getProperty name = "currentProfile" property = "classyear" />
<jsp:getProperty name = "currentProfile" property = "sex" />
<jsp:getProperty name = "currentProfile" property = "orientation" />
<jsp:getProperty name = "currentProfile" property = "status" />
<jsp:getProperty name = "currentProfile" property = "seeking" />
<jsp:getProperty name = "currentProfile" property = "college" />
<jsp:getProperty name = "currentProfile" property = "dorm" />
<jsp:getProperty name = "currentProfile" property = "description" />
<jsp:getProperty name = "currentProfile" property = "activities" />


</jsp:useBean>
</body>
</html>