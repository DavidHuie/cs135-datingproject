package search;

public class QueryableName implements Comparable<QueryableName>{
	 public String name;
	 public String username;
	 public String query;
	
	public QueryableName(String name, String username, String query) {
		this.name = name;
		this.username = username;
		this.query = query;
	}
	
	public int compareTo(QueryableName name) {
		return LevenshteinDistanceMetric.distance(this.name, this.query) -
		LevenshteinDistanceMetric.distance(name.name, name.query);
	}
}
