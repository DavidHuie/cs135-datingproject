package login_utilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.AccessDB;


public class UserAuthentication {
	
	// Will ensure that a user with the given password exists
	public static Boolean authenticate_login(String username, String password) throws SQLException {
		
		// Check easy cases
		if (username == null || password == null || username.equals("") || password.equals("")) {
			return false;
		}
		
		// Check login credentials in database
		
		if (usernameExists(username)) {
			return validatePassword(username, password);
		} else {
			return false;
		}
	}
	
	public static Boolean usernameExists(String username) throws SQLException {
		String query = "SELECT username FROM main WHERE main.username = \"" + username + "\"";
		ResultSet result = AccessDB.get_result_set(query);
		
		// This is valid because next() returns a boolean
		return result.next();
	}
	
	public static Boolean validatePassword(String username, String password) throws SQLException {
		String query = "SELECT password FROM main WHERE main.username = \"" + username + "\"";
		ResultSet result = AccessDB.get_result_set(query);
		String db_password = result.getString("password");
		return password.equals(db_password);
	}
}
