package search;

import java.io.IOException;
import java.util.*;
import java.io.*;
import java.sql.*;

import search.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import Beans.*;
import database.*;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
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
		String searchtype = null;
		searchtype = request.getParameter("searchtype");
		if (searchtype == null)
		{
			response.sendRedirect("SearchProfiles.jsp");
		}
		else if(searchtype == "match")
		{
			searchByMatch(request, response);
		}
	
		else if(searchtype == "random")
		{
			searchByRandom(request, response);
	
		}

		else if(searchtype =="name")
		{
			searchByName(request, response);
		}
		
	}

		public void searchByMatch(HttpServletRequest request, HttpServletResponse response)
		{
			ProfileBean currentuser = (ProfileBean)getServletContext().getAttribute("userProfile");
			String username = currentuser.getUsername();
			String description = currentuser.getDescription();
			String sex = currentuser.getSex();
			String orientation = currentuser.getOrientation();
			if((sex!=null)&&(orientation !=null)&& (description!=null))
			{
				try {
					int k;
					String beanname;
					String resultusername;
					ArrayList<DescriptionMatcher> list = search.SearchTools.get_matches(description, sex, orientation);
					DescriptionMatcher match;
					for(int i =0; i<6; i++)
					{
						match = list.get(i);
						k = i +1;
						resultusername = match.username;
						beanname = "ProfileBean" + Integer.toString(i);
						ProfileBean 
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public void searchByRandom(HttpServletRequest request, HttpServletResponse response)
		{
			
		}

		public void searchByName(HttpServletRequest request, HttpServletResponse response)
		{
			
		}
}
