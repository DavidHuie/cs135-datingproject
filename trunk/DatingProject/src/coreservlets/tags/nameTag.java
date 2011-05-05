package coreservlets.tags;
/**
 * This class retrieves the logged in User's name from a cookie.
 */
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import Beans.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class nameTag extends SimpleTagSupport {
	public void doTag() throws JspException, IOException
	{
		PageContext context = (PageContext)getJspContext();
		HttpServletRequest request = (HttpServletRequest)context.getRequest();
		ServletContext scontext = request.getServletContext();
		ProfileBean userprofile = (ProfileBean)scontext.getAttribute("userProfile");
		Cookie cookie = coreservlets.CookieUtilities.getCookie(request, "claremontcupidusername");
		String name = cookie.getValue();
		JspWriter out = getJspContext().getOut();
		out.print(name);
		
		
	}
	
}
