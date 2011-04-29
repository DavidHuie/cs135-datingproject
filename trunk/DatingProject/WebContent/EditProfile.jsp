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
<jsp:useBean id ="userProfileBean" class = "Beans.ProfileBean" scope = "application" />
<form action = "EditProfileServlet">
<textarea id = "usernametext" name = "username" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "username" />
</textarea>
<br />
<button id = "username" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "fullnametext" name = "fullname" rows = "3" cols = "35">
<jsp:getProperty name = "userProfileBean" property = "fullname" />
</textarea>
<br />
<button id = "fullname" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "emailtext" name = "email" rows = "3" cols = "35">
<jsp:getProperty name = "userProfileBean" property = "email" />
</textarea>
<br />
<button id = "email" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "agetext" name = "age" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "age" />
</textarea><br />
<button id = "age" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "birthmonthtext" name = "birthmonth" rows = "3" cols = "35" > 
<jsp:getProperty name = "userProfileBean" property = "birthmonth" />
</textarea><br />
<button id = "birthmonth" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "birthdaytext" name = "birthday" rows = "3" cols = "35"> 
<jsp:getProperty name = "userProfileBean" property = "birthday" />
</textarea>
<button id = "birthday" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />


<textarea id = "birthyeartext" name = "birthyear"  rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "birthyear" />
</textarea>
<button id = "birthyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "classyeartext" name = "classyear" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "classyear" />
</textarea>
<button id = "classyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "sextext" name = "sex" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "sex" />
</textarea>
<button id = "sex" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id= "orientationtext" name = "orientation" rows = "3" cols = "35">
<jsp:getProperty name = "userProfileBean" property = "orientation" />
</textarea>
<button id = "orientation" onclick = "DatingApp.editButton(this.id)">Edit</button>

<textarea id= "statustext" name = "status" rows = "3" cols = "35">
<jsp:getProperty name = "userProfileBean" property = "status" />
</textarea> <br />
<button id = "status" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />


<textarea id = "seekingtext" name = "seeking" rows = "3" cols = "35">
<jsp:getProperty name = "userProfileBean" property = "seeking" /><br />
</textarea><br />
<button id = "seeking" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "collegetext" name = "college" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "college" />
</textarea>
<br />
<button id = "college" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "dormtext" name = "dorm" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "dorm" />
</textarea>
<br />
<button id = "dorm" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "descriptiontext" name = "description" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "description" />
</textarea>
<br />
<button id = "description" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<textarea id = "activitiestext" name = "activities" rows = "3" cols = "35" >
<jsp:getProperty name = "userProfileBean" property = "activities" />
</textarea>
<br />
<button id = "activities" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<input type ="submit" value = "Submit">
</form>


</body>
</html>