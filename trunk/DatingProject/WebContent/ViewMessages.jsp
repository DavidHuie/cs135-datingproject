<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
      href="./css/style.css"
      type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Messages</title>
</head>
<body>

<h1>Messages</h1>
<%@ page import="java.util.*, coreservlets.*, Beans.*, Keywords.*,messaging.*" %>

<%  ServletConfig sconfig = getServletConfig();
	ServletContext scontext = sconfig.getServletContext();
 
	ProfileBean user_bean = (ProfileBean) scontext.getAttribute("userProfile");
	String username = user_bean.getUsername();
	ArrayList<Message> messages = MessageTools.get_recipient_messages(username);
	
	if (messages == null) {
		out.println("<b>No messages.</b>");
	} else if (messages.size() == 0){
		out.println("<b>No messages.</b>");
	} else {
		out.println("<table border=\"1\">");
	
		for (Iterator<Message> i = messages.listIterator(); i.hasNext();) {
			Message message = i.next();
			  
			String list = "<td><ul>" + "<li>Sender: " + message.sender + "</li>" +
								       "<li>Date: " + message.time_stamp.toString() + "</li>" +
								       "<li>Message: " + message.message_body + "</li>" + "</ul></td>";
			
			out.println("<tr>" + list + "</tr>");
		}
		out.println("</table>");
	}
%>

<a href ="HomeServlet">Home</a><br />
<a href ="LogoutServlet">Log Out</a>


</body>
</html>