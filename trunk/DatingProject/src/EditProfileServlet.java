import java.sql.SQLException;
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
				request.getParameter("fullname"),  
				request.getParameter("email"), 
				request.getParameter("age"),
				request.getParameter("sex"),
				request.getParameter("orientation"),
				request.getParameter("description"),
				request.getParameter("college"),
				request.getParameter("dorm"),
				request.getParameter("activities"),
				request.getParameter("status"), 
				request.getParameter("seeking"),
				request.getParameter("birthday"),
				request.getParameter("birthmonth"),
				request.getParameter("birthyear"),
				request.getParameter("classyear"));
				String username = request.getParameter("username");
				try{
				String password = login_utilities.UserAuthentication.getPassword(username);
				database.InsertProfile.InsertBean(newBean, password);
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("username at edit is " +newBean.getUsername());
				getServletContext().setAttribute("username",newBean.getUsername());
				response.sendRedirect("ViewProfileServlet");
				
	
	
	}

}
