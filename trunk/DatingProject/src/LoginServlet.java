

import java.io.IOException;
import java.sql.SQLException;

import login_utilities.*;
import javax.servlet.*;
import coreservlets.ServletUtilities;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get parameters and filter them
		String username = ServletUtilities.filter(request.getParameter("username"));
		String password = ServletUtilities.filter(request.getParameter("password"));
		
		// add cookies to response
		try {
			if (UserAuthentication.authenticate_login(username, password)){
				Cookies.createValidatedUserCookies(response, username, password);
				
				// Redirect to homepage
				response.sendRedirect("/index.html"); // placeholder
			} else {
				// Show login error
				//response.sendError(403, "Invalid user credentials");
				//sends the user back to Login Page, this time an error will be displayed.
				RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
				request.setAttribute("Error", true);
				dispatcher.forward(request,response);
			
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
