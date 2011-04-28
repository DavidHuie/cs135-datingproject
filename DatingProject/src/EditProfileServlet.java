import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;

import Beans.*;
import database.*;
/**
 * Servlet implementation class EditProfileServlet
 */
@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileBean newBean = new ProfileBean(request.getParameter("username"), 
				request.getParameter("fullnametext"), 
				request.getParameter("passwordtext"), 
				request.getParameter("emailtext"), 
				request.getParameter("agetext"),
				request.getParameter("sextext"),
				request.getParameter("orientationtext"),
				request.getParameter("descriptiontext"),
				request.getParameter("collegetext"),
				request.getParameter("dormtext"),
				request.getParameter("activitiestext"),
				request.getParameter("statustext"), 
				request.getParameter("seekingtext"),
				request.getParameter("birthdaytext"),
				request.getParameter("birthmonthtext"),
				request.getParameter("birthyeartext"),
				request.getParameter("classyeartext"));
				database.InsertProfile.InsertBean(newBean);
				//maybe don't need this code, we'll see.
				/*ServletConfig sconfig = getServletConfig();
				ServletContext scontext = sconfig.getServletContext();
				scontext.setAttribute("userProfileBean", newBean);
				scontext.setAttribute("currentProfile", newBean);*/
				request.setAttribute("username",newBean.getUsername());
				RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewProfile.jsp");
				dispatcher.forward(request, response);
	
	
	}

}
