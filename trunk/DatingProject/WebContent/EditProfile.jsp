<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
<script type = "text/javascript" src = "DatingScripts.js"></script>
</head>
<body>
Current Profile Info:
<textarea disabled = "disabled">Hello Everybody</textarea>
<jsp:useBean id ="userProfileBean" class = "Beans.ProfileBean" scope = "application">
<form action = >
<textarea id = "usernametext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "username" />
</textarea>
<br />
<button id = "username" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "fullnametext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "fullname" />
</textarea>
<br />
<button id = "fullname" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "emailtext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "email" />
</textarea>
<br />
<button id = "email" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "agetext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "age" />
</textarea><br />
<button id = "age" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "birthmonthtext" rows = "3" cols = "35" disabled = "disabled"> 
<jsp:getProperty name = "userProfileBean" property = "birthmonth" />
</textarea><br />
<button id = "birthmonth" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "birthmonthtext" rows = "3" cols = "35" disabled = "disabled"> 
<jsp:getProperty name = "userProfileBean" property = "birthday" />
</textarea>
<button id = "birthmonth" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />


<textarea id = "birthyeartext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "birthyear" />
</textarea>
<button id = "birthyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "classyeartext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "classyear" />
</textarea>
<button id = "classyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "sextext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "sex" />
</textarea>
<button id = "sex" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id= "orientationtext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "orientation" />
</textarea>
<button id = "orientation" onclick = "DatingApp.editButton(this.id)">Edit</button>

<textarea id= "statustext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "status" />
</textarea> <br />
<button id = "status" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />


<textarea id = "seekingtext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "seeking" /><br />
</textarea><br />
<button id = "seeking" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "collegetext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "college" />
</textarea>
<br />
<button id = "college" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "dormtext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "dorm" />
</textarea>
<br />
<button id = "dorm" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "descriptiontext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "description" />
</textarea>
<br />
<button id = "description" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "activitiestext" rows = "3" cols = "35" disabled = "disabled">
<jsp:getProperty name = "userProfileBean" property = "activities" />
</textarea>
<br />
<button id = "activities" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
</form>

</jsp:useBean>

</body>
</html>