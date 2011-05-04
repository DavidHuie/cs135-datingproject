package search;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import database.AccessDB;

public class SearchTools {
	
	// Takes in a search query consisting of a user's full name.
	// Returns an ArrayList of QueryableNames ordered by relevance.
	public static ArrayList<QueryableName> get_queryable_names_list(String search_query) throws SQLException {
		String query = "SELECT username, fullname FROM main";
		ResultSet set = AccessDB.get_result_set(query);
		
		if (set == null)
			return null;
		
		ArrayList<QueryableName> list = new ArrayList<QueryableName>();
		
		while (set.next()) {
			String username = set.getString("username");
			String fullname = set.getString("fullname");
			
			QueryableName n = new QueryableName(fullname, username, search_query);
			list.add(n);
		}
		
		Collections.sort(list);
		
		return list;
	}
	
	public static ArrayList<DescriptionMatcher> get_matches(String description, String sex, String orientation) throws SQLException {
		String query = "SELECT * FROM main WHERE sex = \'" + sex + "orientation = \'" + orientation + "\'";
		ResultSet set = AccessDB.get_result_set(query);
		
		ArrayList<DescriptionMatcher> list = new ArrayList<DescriptionMatcher>();
		
		while (set.next()) {
			String user_description = set.getString("description");
			String username = set.getString("username");
			
			DescriptionMatcher match = new DescriptionMatcher(user_description, username, description);
			list.add(match);
		}
		
		// Return a random person meeting the variables
		
		Collections.sort(list);
		
		return list;
	}
	
	// Returns the username of a blind match
	public static String blind_match(String sex, String orientation, String college) throws SQLException {
		String query = "SELECT * FROM main WHERE sex=\'" + sex +"\' AND orientation=\'" + orientation + "\'";
		ResultSet set = AccessDB.get_result_set(query);
		
		ArrayList<String> list = new ArrayList<String>();
		
		while (set.next()) {
			list.add(set.getString("username"));
		}
		
		if (list.isEmpty()) {
			return null;
		}
		
		// Return a random person meeting the variables
		
		Random random = new Random();
		String match = list.get(random.nextInt(list.size()));

		return match;
	}
	
	
	
	public static String test() throws SQLException {
		ArrayList<QueryableName> x = get_queryable_names_list("mt"); // should return matt as closest
		return x.remove(0).name;
	}
}
