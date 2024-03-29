package database;

import java.sql.*;

/**
 * AccessDB 
 * @author Bryce Gerard, David Huie, Chrysanthia Cheung-Lau
 * 
 * this class starts the connection with the main database
 */
public class AccessDB
{
	static{
		try{
			System.out.println("About to load the driver");
            //Class.forName("com.mysql.jdbc.Driver");
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
            ("jdbc:mysql://localhost:3306/DB",
	     "user",
	     "password");
		}
		
		public static ResultSet get_result_set(String query) {
			try {
				Connection connection = openconnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query);
				return resultSet;
			} catch (SQLException e) {
				throw new RuntimeException("Error accessing database: " + e);
			}
		}
		
		public static void execute_update_query(String query) throws SQLException {
			Connection connection = openconnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
		}
		
}