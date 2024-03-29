package login_utilities;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class Cookies {
	
	public static String cookiePrefix = "claremontcupid";
	public static String usernameSuffix = "username";
	public static String passwordSuffix = "password";
	
	
	// This function assumes that the username and password are valid
	
	// This function adds cookies for a logged-in user
	public static void createValidatedUserCookies(HttpServletResponse response, String username, String password) {
		Cookie userCookie = new Cookie(cookiePrefix + usernameSuffix, username);
		Cookie passwordCookie = new Cookie(cookiePrefix + passwordSuffix, password);
		
		userCookie.setMaxAge(60*60*24*365);
		passwordCookie.setMaxAge(60*60*24*365);
		
		response.addCookie(userCookie);
		response.addCookie(passwordCookie);
	}
	
	
	// Erases a users logged-in cookies
	public static void clearUserCookies(HttpServletResponse response) {
		Cookie userCookie = new Cookie(cookiePrefix + usernameSuffix, null);
		Cookie passwordCookie = new Cookie(cookiePrefix + passwordSuffix, null);
		
		// Set max age to 0 so cookies are deleted
		userCookie.setMaxAge(0);
		passwordCookie.setMaxAge(0);
		
		response.addCookie(userCookie);
		response.addCookie(passwordCookie);
		
	}

}
