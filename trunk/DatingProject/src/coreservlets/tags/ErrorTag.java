package coreservlets.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import javax.servlet.http.*;
public class ErrorTag extends SimpleTagSupport{
	
	/**
	 * basically, this tag functions as an all purpose error custom tag
	 * that when it receives a parameter called "Error", which could be triggered by a multitude
	 * of factors, it will print out the contents of it's tag body.
	 * @throws JspException
	 * @throws IOException
	 */
	@Override
	public void doTag() throws JspException, IOException
	{
		PageContext context = (PageContext)getJspContext();
		HttpServletRequest request = (HttpServletRequest)context.getRequest();
		//only outputs error message if there is an error i.e. a duplicate registration.
		if(request.getParameter("Error")!=null){
			getJspBody().invoke(null);
		}
	}
	
}	


