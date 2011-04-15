

import java.io.IOException;
import login_utilities.*;

import coreservlets.ServletUtilities;
import coreservlets.ServletUtilities.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = ServletUtilities.filter(request.getParameter("username"));
		String password = ServletUtilities.filter(request.getParameter("password"));
		
		if login_utilities.UserAuthentication(username, password) {
			// do stuff
		}
	}

}
