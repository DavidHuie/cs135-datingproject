package database;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Beans.ProfileBean;
public class db_tools {
	
	public static void init_user(String username) {
		String def = "";
		changeInfo(username, "fullname", def);
		changeInfo(username, "age", def);
		changeInfo(username, "email", def);
		changeInfo(username, "orientation", def);
		changeInfo(username, "classyear", def);
		changeInfo(username, "sex", def);
		changeInfo(username, "description", def);
		changeInfo(username, "dorm", def);
		changeInfo(username, "activities", def);
		changeInfo(username, "status", def);
		changeInfo(username, "birthday", def);
		changeInfo(username, "birthmonth", def);
		changeInfo(username, "birthyear", def);
		changeInfo(username, "seeking", def);
		changeInfo(username, "college", def);
	}
	
	
	/**
	 * @author Bryce Gerard
	 * @description inserts a new profile, or an edit of an existing profile into the database.
	 * @param pw insert the password here if you are creating a brand new account. Otherwise, just use any string, 
	 * and the program will take care of it.
	 */
	public static void InsertBean(ProfileBean bean, String pw)
	{
		String username = bean.getUsername();
		String fullname = bean.getFullname();
		String email = bean.getEmail();
		String age = bean.getAge();
		String password = pw;
		String sex = bean.getSex();
		String orientation= bean.getOrientation();
		String description = bean.getDescription();
		String college = bean.getCollege();
		String dorm = bean.getDorm();
		String activities = bean.getActivities();
		String status = bean.getStatus();
		String seeking = bean.getSeeking();
		String birthday = bean.getBirthday();
		String birthmonth = bean.getBirthmonth();
		String birthyear = bean.getBirthyear();
		String classyear = bean.getClassyear();
		try {
			String query;
			boolean isOld = login_utilities.UserAuthentication.usernameExists(username);
			Connection connection = AccessDB.openconnection();
			Statement statement = connection.createStatement();
			if(isOld){
			password = login_utilities.UserAuthentication.getPassword(username);	
			query = "DELETE FROM main WHERE username =\'"+username+"\';";
			statement.executeUpdate(query);
			}
			query = "INSERT INTO main (username) VALUES("+"\""+username+"\"";
			changeInfo(username, "fullname", fullname);
			changeInfo(username, "email", email);
			changeInfo(username, "password", password);
			changeInfo(username, "age", age);
			changeInfo(username, "orientation", orientation);
			changeInfo(username, "classyear", classyear);
			changeInfo(username, "sex", sex);
			changeInfo(username, "description", description);
			changeInfo(username, "dorm", dorm);
			changeInfo(username, "activities", activities);
			changeInfo(username, "status", status);
			changeInfo(username, "birthday", birthday);
			changeInfo(username, "birthmonth", birthmonth);
			changeInfo(username, "birthyear", birthyear);
			changeInfo(username, "seeking", seeking);
			changeInfo(username, "college", college);
			
			
			statement.executeUpdate(query);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param username the username of the profile user whose info you would like to change.
	 * @param type the category of information you would like to change (e.g. fullname, etc.)
	 * @param value, the value you would like type to be.
	 */
	public static void changeInfo(String username, String type, String value)
	{
		try {
			Connection connection = AccessDB.openconnection();
			Statement statement = connection.createStatement();
			String query = "UPDATE main SET "+ type +"=\'"+value+"\'"+" WHERE username=\'"+username+"\';";
			System.out.println("query at changeInfo: " + query);
			statement.executeUpdate(query);
			
			}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static void editEntry(ProfileBean bean, String pw)
	{
		String username = bean.getUsername();
		String fullname = bean.getFullname();
		String email = bean.getEmail();
		String age = bean.getAge();
		String password = pw;
		String sex = bean.getSex();
		String orientation= bean.getOrientation();
		String description = bean.getDescription();
		String college = bean.getCollege();
		String dorm = bean.getDorm();
		String activities = bean.getActivities();
		String status = bean.getStatus();
		String seeking = bean.getSeeking();
		String birthday = bean.getBirthday();
		String birthmonth = bean.getBirthmonth();
		String birthyear = bean.getBirthyear();
		String classyear = bean.getClassyear();
		try {
			Connection connection = AccessDB.openconnection();
			Statement statement = connection.createStatement();
			
			changeInfo(username, "fullname", fullname);
			changeInfo(username, "email", email);
			changeInfo(username, "password", password);
			changeInfo(username, "age", age);
			changeInfo(username, "orientation", orientation);
			changeInfo(username, "classyear", classyear);
			changeInfo(username, "sex", sex);
			changeInfo(username, "description", description);
			changeInfo(username, "dorm", dorm);
			changeInfo(username, "activities", activities);
			changeInfo(username, "status", status);
			changeInfo(username, "birthday", birthday);
			changeInfo(username, "birthmonth", birthmonth);
			changeInfo(username, "birthyear", birthyear);
			changeInfo(username, "seeking", seeking);
			changeInfo(username, "college", college);
			
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void SendMessage(String sender, String recipient, String body, String timestamp)throws SQLException
	{
		Connection connection = AccessDB.openconnection();
		Statement statement = connection.createStatement();
		String query = "INSERT INTO messages(sender, recipient, message_body, time_stamp) VALUES(\""+sender+"\", "+
		"\""+recipient+"\", "+"\""+body+"\", "+"\""+timestamp+"\");";
		System.out.println("db_tools.sendmessage query: " +query);
		statement.executeUpdate(query);
		
	}
	
}
