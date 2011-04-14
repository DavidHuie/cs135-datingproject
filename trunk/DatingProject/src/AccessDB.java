import java.sql.*;
/**
 * AccessDB 
 * @author Bryce Gerard
 * 
 * this class starts the connection with the main database
 */
public class AccessDB
{
	static{
		try{
			System.out.println("About to load the driver");
            //	    Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("The driver is loaded");
			
			
		}
		catch (ClassNotFoundException cnfe) {
				throw new RuntimeException(cnfe);
		}
		
		}
	
		/**
		 * in this class we need to change the strings for user, password and the URL
		 * so that they reflect our situation
		 * @return
		 * @throws SQLException
		 */
		public static Connection openconnection() throws SQLException
		{
			return DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/bookDB",
	     "user",
	     "password");
		}
		
}