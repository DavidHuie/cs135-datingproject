package database;
import java.util.*;

import java.sql.*;

import Beans.*;
import login_utilities.*;
public class InsertProfile {
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
			query = "INSERT INTO main(username, " +
					"fullname, "+
					"password, "+
					"email, "+
					"age, "+
					"classyear, "+
					"sex, "+
					"orientation, "+
					"description, "+
					"dorm, "+
					"activities, "+
					"status, " +
					"birthday, " +
					"birthmonth, "+
					"birthyear, " +
					"seeking, " +
					"college) "+
					"VALUES("+
					"\""+username+"\", "+
					"\""+fullname+"\", "+ 
					"\""+email+"\", "+ 
					"\""+password+"\", "+ 
					"\""+age+"\", "+ 
					"\""+classyear+"\", "+ 
					"\""+sex+"\", "+ 
					"\""+orientation+"\", "+ 
					"\""+description+"\", "+ 
					"\""+dorm+"\", "+ 
					"\""+activities+"\", "+ 
					"\""+status+"\", " +
					"\""+birthday+"\", "+ 
					"\""+birthmonth+"\", "+ 
					"\""+birthyear+"\", "+ 
					"\""+seeking+"\", "+
					"\""+college+"\")";
			statement.executeUpdate(query);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
