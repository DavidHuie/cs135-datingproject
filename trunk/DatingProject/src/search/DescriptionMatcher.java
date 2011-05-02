package search;

public class DescriptionMatcher implements Comparable<DescriptionMatcher>{
	 public String description;
	 public String username;
	 public String base_description;
	 public int score;
	
	public DescriptionMatcher(String description, String username, String base_description) {
		this.description = description;
		this.username = username;
		this.base_description = base_description;
	}
	
	public int compareTo(DescriptionMatcher other) {
		this.score = LevenshteinDistanceMetric.distance(this.description, this.base_description) -
		LevenshteinDistanceMetric.distance(other.description, this.base_description);
		
		return this.score;
	}
}
