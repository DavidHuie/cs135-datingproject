
import java.util.*;

import java.sql.*;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		String RequestType = null;
		RequestType = request.getParameter("RequestType");
		if(RequestType == null){
			RequestType = "none";
		}
		if (RequestType.equals("Registration")){
			try {
				//Register the User.
				RegisterUser(request, response);
				//use request to share information.
			
				RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginServlet");
				
			} 
			
			catch (SQLException sqle) {
				throw new RuntimeException("Error accessing database: " + sqle);
			}
		}
	}



	/**
	 * This method registers the users.
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void RegisterUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String username = coreservlets.ServletUtilities.filter(request.getParameter("username"));
		String password = request.getParameter("password");
		//connect to database
		try{
		Connection connection = database.AccessDB.openconnection();
		Statement statement = connection.createStatement();
		String query = "INSERT INTO main(username, password) VALUES(\""+username+"\", \""+ password+"\");";
		//add name and password to database.
		statement.executeUpdate(query);
		//store username and password in request
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		//send request to login servlet.
		RequestDispatcher dispatcher = request.getRequestDispatcher("/LoginServlet");
		dispatcher.forward(request, response);
		
		}
		
		catch (SQLException sqle) {
		    throw new RuntimeException("Error accessing database: " + sqle);
		}
	}
}
	