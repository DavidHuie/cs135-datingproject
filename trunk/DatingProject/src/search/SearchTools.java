package search;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import database.AccessDB;

public class SearchTools {
	public ArrayList<QueryableName> get_queryable_names_list(String search_query) throws SQLException {
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
}
