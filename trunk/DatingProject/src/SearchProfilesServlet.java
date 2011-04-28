

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import database.*;
import java.sql.SQLException;
import java.util.*;
import Beans.*;
import search.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchProfilesServlet
 */
@WebServlet("/SearchProfilesServlet")
public class SearchProfilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProfilesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		String query =request.getParameter("query");
		try {
			ArrayList<QueryableName> ResponseNames = search.SearchTools.get_queryable_names_list(query);
			ArrayList<ProfileBean> ResponseBeans = new ArrayList<ProfileBean>();
			String username;
			int size = ResponseNames.size();
			int limit = size > 6 ? 6: size;
			ServletConfig sconfig = getServletConfig();
			ServletContext scontext = sconfig.getServletContext();
			String BeanName;
			for(int i = 0; i<limit; i++)
			{
				username = ResponseNames.get(i).username;
				ProfileBean Bean = database.CreateBean.createBeanFromDB(username);
				BeanName = "ResultsProfile" +Integer.toString(i);
				scontext.setAttribute(BeanName, Bean);
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("SearchProfiles.jsp");
			dispatcher.forward(request, response);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
