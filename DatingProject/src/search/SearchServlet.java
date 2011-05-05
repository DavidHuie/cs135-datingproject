package search;

import java.io.IOException;
import java.util.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import Beans.*;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static Integer num_results = 20;
       
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
		String searchtype = request.getParameter("searchtype");
		
		if(searchtype.equals("name"))
		{
			System.out.println("in name");
			try {
				searchByName(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (searchtype.equals("match")) {
			try {
				searchByMatch(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private static ArrayList<ProfileBean> get_beans_from_DM(ArrayList<DescriptionMatcher> results) throws SQLException {
		ArrayList<ProfileBean> new_results = new ArrayList<ProfileBean>();
		
		Integer count = 0;
		
		for (Iterator<DescriptionMatcher> i = results.listIterator(); i.hasNext();) {
			if (count == num_results) {
				break;
			}
			
			String username = i.next().username;
			ProfileBean new_bean = database.CreateBean.createBeanFromDB(username);
			new_results.add(new_bean);
			count++;
		}
		
		return new_results;
	}

	public void searchByMatch(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		ServletConfig sconfig = getServletConfig();
		ServletContext scontext = sconfig.getServletContext();
		
		ProfileBean user_bean = (ProfileBean) scontext.getAttribute("userProfile");

		String user_description = user_bean.getDescription();
		String desired_sex = request.getParameter("sex");
		String orientation = request.getParameter("orientation");
		
		ArrayList<DescriptionMatcher> names = search.SearchTools.get_matches(user_description, desired_sex, orientation);
		ArrayList<ProfileBean> results = get_beans_from_DM(names);
		
		scontext.setAttribute("search_results", results);
		
		response.sendRedirect("SearchProfiles.jsp");
	}
	
	private static ArrayList<ProfileBean> get_beans_from_QN(ArrayList<QueryableName> results) throws SQLException {
		ArrayList<ProfileBean> new_results = new ArrayList<ProfileBean>();
		
		Integer count = 0;
		
		for (Iterator<QueryableName> i = results.listIterator(); i.hasNext();) {
			if (count == num_results) {
				break;
			}
			
			String username = i.next().username;
			ProfileBean new_bean = database.CreateBean.createBeanFromDB(username);
			new_results.add(new_bean);
			count++;
		}
		
		return new_results;
	}

	public void searchByName(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException
	{
		String query = request.getParameter("query");
		
		ArrayList<QueryableName> names = search.SearchTools.get_queryable_names_list(query);
		ArrayList<ProfileBean> results = get_beans_from_QN(names);
		
		ServletConfig sconfig = getServletConfig();
		ServletContext scontext = sconfig.getServletContext();
		
		scontext.setAttribute("search_results", results);
		
		response.sendRedirect("SearchProfiles.jsp");
	}
}
