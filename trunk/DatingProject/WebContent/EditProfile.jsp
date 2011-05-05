<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
<script type = "text/javascript" src = "DatingScripts.js"></script>
</head>
<body>
Current Profile Info:

<jsp:useBean id ="userProfile" class = "Beans.ProfileBean" scope = "application" />
<form action = "EditProfileServlet">

<b>Full Name</b><br />
<textarea id = "fullnametext" name = "fullname" rows = "3" cols = "35" readonly = true>
<jsp:getProperty name = "userProfile" property = "fullname" />
</textarea>
<br />
<button type ="button" id = "fullname" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>email</b><br />
<textarea id = "emailtext" name = "email" rows = "3" cols = "35" readonly = true>
<jsp:getProperty name = "userProfile" property = "email" />
</textarea>
<br />
<button type ="button" id = "email" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>Age</b><br />
<textarea id = "agetext" name = "age" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "age" />
</textarea><br />
<button type ="button" id = "age" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>birth month</b><br />
<textarea id = "birthmonthtext" name = "birthmonth" rows = "3" cols = "35" readonly = true > 
<jsp:getProperty name = "userProfile" property = "birthmonth" />
</textarea><br />
<button type ="button" id = "birthmonth" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>birth day</b><br />
<textarea id = "birthdaytext" name = "birthday" rows = "3" cols = "35" readonly = true> 
<jsp:getProperty name = "userProfile" property = "birthday" />
</textarea><br />
<button type ="button" id = "birthday" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />


<b>birth year</b><br />
<textarea id = "birthyeartext" name = "birthyear"  rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "birthyear" />
</textarea><br />
<button type ="button" id = "birthyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>class year</b><br />
<textarea id = "classyeartext" name = "classyear" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "classyear" />
</textarea><br />
<button type ="button" id = "classyear" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>sex</b><br />
<textarea id = "sextext" name = "sex" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "sex" />
</textarea><br />
<button type ="button" id = "sex" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>orientation</b><br />
<textarea id= "orientationtext" name = "orientation" rows = "3" cols = "35" readonly = true>
<jsp:getProperty name = "userProfile" property = "orientation" />
</textarea><br />
<button type ="button" id = "orientation" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />
<b>status</b><br />
<textarea id= "statustext" name = "status" rows = "3" cols = "35" readonly = true>
<jsp:getProperty name = "userProfile" property = "status" />
</textarea> <br />
<button type ="button" id = "status" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>seeking</b><br />
<textarea id = "seekingtext" name = "seeking" rows = "3" cols = "35" readonly = true>
<jsp:getProperty name = "userProfile" property = "seeking" />
</textarea><br />
<button type ="button" id = "seeking" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>college</b><br />
<textarea id = "collegetext" name = "college" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "college" />
</textarea>
<br />
<button type ="button" id = "college" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>dorm</b><br />
<textarea id = "dormtext" name = "dorm" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "dorm" />
</textarea>
<br />
<button type ="button" id = "dorm" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<br />

<b>description</b><br />
<textarea id = "descriptiontext" name = "description" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "description" />
</textarea>
<br />
<button type ="button" id = "description" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />

<b>activities</b><br />
<textarea id = "activitiestext" name = "activities" rows = "3" cols = "35" readonly = true >
<jsp:getProperty name = "userProfile" property = "activities" />
</textarea>
<br />
<button type ="button" id = "activities" onclick = "DatingApp.editButton(this.id)">Edit</button>
<br />
<input type ="submit" value = "Save all edits">
</form>
<br/>
<br />
<a href = "HomeServlet">Home</a>
<a href = "LogoutServlet">log out</a>

</body>
</html>