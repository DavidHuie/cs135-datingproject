/**
 * @author Bryce Gerard
 * CS135 Final Project
 * This is a bean class that stores all of the information from a User's profile
 */
import java.util.*;
import java.io.*;
public class ProfileBean {
	private String username;
	private String password;
	private String email;
	private String age;
	private String sex;
	private String orientation;
	private String description;
	private String college;
	private String activities;
	private String status;
	private String seeking;
	private String birthday;
	private String birthmonth;
	private String birthyear;
	private String classyear;
	
	public void setUsername(String param){
		this.username = param;
	}
	
	public String getUsername()
	{
		return(username);
	}

	public void setPassword(String param){
		this.password = param;
	}
	
	public String getPassword()
	{
		return(password);
	}

	public void setEmail(String param){
		this.email = param;
	}
	
	public String getEmail()
	{
		return(email);
	}

	public void setAge(String param)
	{
		this.age = param;
	}
	
	public void setOrientation(String param){
		this.orientation = param;
	}
	
	public String getOrientation(){
		return(orientation);
	}
	
	public void setDescription(String param){
		this.description = param;
	}
	
	public String getDescription(){
		return(description);
	}
	
	public void setCollege(String param){
		this.college = param;
	}
	
	public String getCollege(){
		return(college);
	}

	public void setActivities(String param){
		this.activities = param;
	}
	
	public String getActivities(){
		return(activities);
	}

	public void setStatus(String param){
		this.status = param;
	}
	
	public String getStatus(){
		return(status);
	}

	public void setSeeking(String param)
	{
		this.seeking = param;
	}

	public String getSeeking()
	{
		return (seeking);
	}

	public void setBirthday(String param){
		this.birthday = param;
	}
	
	public String getBirthday(){
		return(birthday);
	}

	
	public void setBirthmonth(String param){
		this.birthmonth = param;
	}
	
	public String getBirthmonth(){
		return(birthmonth);
	}

	public void setBirthyear(String param){
		this.birthyear = param;
	}
	
	public String getBirthyear(){
		return(birthyear);
	}
	
	public void setClassyear(String param){
		this.classyear = param;
	}
	
	public String getClassyear(){
		return(classyear);
	}



}
