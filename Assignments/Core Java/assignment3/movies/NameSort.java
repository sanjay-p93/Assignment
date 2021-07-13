package movies;

import java.util.Comparator;

public class NameSort implements Comparator<Movie_Details> {

	@Override
	public int compare(Movie_Details o1, Movie_Details o2) {
		
		return o1.getMovie_name().compareToIgnoreCase(o2.getMovie_name());
	}

}
