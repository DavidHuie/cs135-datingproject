import java.util.*;
import database.*;

import java.sql.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Beans.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ProfileBean;

/**
 * Servlet implementation class ViewProfileServlet
 */
@WebServlet("/ViewProfileServlet")
public class ViewProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProfileServlet() {
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
	 * this method creates a profile bean of whatever username specified.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//probably should get the source of the page that it is being sent to from
		//then it needs to figure out the username of the profile that it will be viewing.
		//with that information, it can then view the profile.
		String username= (String)getServletContext().getAttribute("vieweeusername");
		System.out.println("username at ViewProfileServlet is" + username);
		try{
		ProfileBean viewBean = database.CreateBean.createBeanFromDB(username);
		//ServletConfig sconfig = getServletConfig();
		ServletContext scontext = getServletContext();
		scontext.setAttribute("currentProfile", viewBean);
		response.sendRedirect("ViewProfile.jsp");
		
		
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
