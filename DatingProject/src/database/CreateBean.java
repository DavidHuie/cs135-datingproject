package database;
import Beans.*;

import messaging.*;
import java.sql.*;
import java.sql.Date;
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
		System.out.println("username at CreateBean is " +username);
		String query = "SELECT * FROM main WHERE username=\'"
			+username+"\';";
		ResultSet resultset = statement.executeQuery(query);
		resultset.next();
		System.out.println("query at CreateBean is " +query);
		bean.setUsername(username);
		bean.setFullname(resultset.getString("fullname"));
		bean.setEmail(resultset.getString("email"));
		bean.setOrientation(resultset.getString("orientation"));
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
		bean.setSeeking(resultset.getString("seeking"));
		bean.setDorm(resultset.getString("dorm"));
		return bean;
		
		
	}
	
	public static ArrayList<Message> createMessageListFromDB(String username)throws SQLException
	{
		ArrayList<Message> messagearray = new ArrayList<Message>();
		Connection connection = AccessDB.openconnection();
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM messages where recipient=\'"+username+"\';";
		ResultSet resultset = statement.executeQuery(query);
		Message message;
		while(resultset.next())
		{
			String sender = resultset.getString("sender");
			String recipient = resultset.getString(("recipient"));
			String body = resultset.getString("body");
			Date timestamp = resultset.getDate("time_stamp"); 
			message = new Message(sender, recipient, body, timestamp);
			messagearray.add(message);
		}
		Collections.sort(messagearray);
		return messagearray;
	}
	
}
