package search;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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
	
	public static String test() throws SQLException {
		ArrayList<QueryableName> x = get_queryable_names_list("mt"); // should return matt as closest
		return x.remove(0).name;
	}
}
