
import java.sql.SQLException;
import java .util.*;
import java.io.IOException;
import Beans.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import messaging.*;

/**
 * Servlet implementation class ViewMessagesServlet
 */
@WebServlet("/ViewMessagesServlet")
public class ViewMessagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewMessagesServlet() {
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
		ProfileBean UserProfile = (ProfileBean)getServletContext().getAttribute("userProfile");
		String username = UserProfile.getUsername();
		try {
			ArrayList<Message> messages = database.CreateBean.createMessageListFromDB(username);
			getServletContext().setAttribute("messagearray", messages);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
