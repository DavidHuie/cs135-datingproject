package login_utilities;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class Cookies {
	
	static String cookiePrefix = "claremontcupid";
	
	public static void createValidatedUserCookies(HttpServletResponse response, String username, String password) {
		Cookie userCookie = new Cookie(cookiePrefix + "username", username);
		Cookie passwordCookie = new Cookie(cookiePrefix + "password", password);
		
		response.addCookie(userCookie);
		response.addCookie(passwordCookie);
	}
}
