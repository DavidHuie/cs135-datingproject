/**
 * @author Bryce Gerard
 * this servlet takes information from users who are logged in and sends them to the home page.
 * this servlet has t 
 */
import Beans.*;
import database.*;
import coreservlets.*;
import login_utilities.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;


/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletConfig sconfig;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
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
	 * this method uses the cookie with the login info to get the user's username, then it creates 
	 * a ProfileBean with all of their profile information gained from the database, then it stores that 
	 * bean in the servletcontext, then it forwards them to the home.jsp page where they can do whatever they want
	 * 
	 * @variable userprofilebean is the name of the bean where the userprofile is stored.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Cookiename = login_utilities.Cookies.cookiePrefix + login_utilities.Cookies.usernameSuffix;
		Cookie usercookie = coreservlets.CookieUtilities.getCookie(request, "claremontcupidusername");
		String username = usercookie.getValue();
		try{
		ProfileBean userprofile = database.CreateBean.createBeanFromDB(username);
		ServletContext scontext = sconfig.getServletContext();
		scontext.setAttribute("userprofilebean", userprofile);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.jsp");
		dispatcher.forward(request, response);
		}
		catch (SQLException e){
		e.printStackTrace();
		}
	}
}
