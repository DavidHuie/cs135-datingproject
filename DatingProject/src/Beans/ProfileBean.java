/**
 * @author Bryce Gerard
 * CS135 Final Project
 * This is a bean class that stores all of the information from a User's profile
 */
package Beans;
public class ProfileBean {
	private String username;
	private String fullname;
	private String password;
	private String email;
	private String age;
	private String sex;
	private String orientation;
	private String description;
	private String college;
	private String dorm;
	private String activities;
	private String status;
	private String seeking;
	private String birthday;
	private String birthmonth;
	private String birthyear;
	private String classyear;
	
	
	
	public ProfileBean(String username, 
			String fullname, 
			String password,
			String email,
			String age,
			String sex,
			String orientation,
			String description,
			String college,
			String dorm,
			String activities,
			String status,
			String seeking,
			String birthday,
			String birthmonth,
			String birthyear,
			String classyear)
	{
		 this.username= username; 
		 this.fullname= fullname; 
		 this.password= password;
		 this.email= email;
		 this.age = age;
		 this.sex = sex;
		 this.orientation= orientation;
		 this.description = description;
		 this.college = college;
		 this.dorm = dorm;
		 this.activities = activities;
		 this.status = status;
		 this.seeking = seeking;
		 this.birthday = birthday;
		 this.birthmonth = birthmonth;
		 this.birthyear= birthyear;
		 this.classyear = classyear;
		
	}
	
	public ProfileBean() {
		
	}

	public void setUsername(String param){
		this.username = param;
	}
	
	public String getUsername(){
		return(username);
	}
	
	public String getAge()
	{
		return(age);
	}
	
	public void setDorm(String param){
		this.dorm = param;
	}
	
	public String getDorm()
	{
		return(dorm);
	}

	public void setPassword(String param){
		this.password = param;
	}
	
	public String getPassword()
	{
		return(password);
	}
	
	public void setFullname(String param){
		this.fullname = param;
	}
	
	public String getFullname()
	{
		return(fullname);
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

	public void setSex(String param)
	{
		this.sex = param;
	}

	public String getSex()
	{
		return(sex);
	}
	
	
}
