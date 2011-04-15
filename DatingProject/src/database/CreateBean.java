package database;
import Beans.*;
import java.sql.*;
import java.util.*;

/**
 * this class is a class for the creation of Beans using the Database
 * @author Bryce
 *
 */
public class CreateBean {
	/**
	 * 
	 * @param username the name of the user whose profile bean is being created
	 * @return a bean with all of the user data
	 * @throws SQLException
	 */
	public static ProfileBean createBeanFromDB(String username) throws SQLException
	{
		ProfileBean bean = new ProfileBean();
		Connection connection = AccessDB.openconnection();
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM main WHERE username=\'"+username+"\';";
		ResultSet resultset = statement.executeQuery("query");
		bean.setUsername(username);
		bean.setPassword(resultset.getString("password"));
		bean.setEmail(resultset.getString("email"));
		bean.setActivities(resultset.getString("activities"));
		bean.setAge(resultset.getString("age"));
		bean.setBirthday(resultset.getString("birthday"));
		bean.setBirthyear(resultset.getString("birthyear"));
		bean.setBirthmonth(resultset.getString("birthmonth"));
		bean.setSex(resultset.getString("sex"));
		bean.setCollege(resultset.getString("college"));
		bean.setDescription(resultset.getString("description"));
		bean.setStatus(resultset.getString("status"));
		bean.setClassyear(resultset.getString("classyear"));
		return bean;
		
		
	}
	
	
}
