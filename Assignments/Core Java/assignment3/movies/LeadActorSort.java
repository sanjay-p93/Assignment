package movies;

import java.util.Comparator;

public class LeadActorSort implements Comparator<Movie_Details>  {

	@Override
	public int compare(Movie_Details o1, Movie_Details o2) {
		
		return o1.getLead_actor().compareToIgnoreCase(o2.getLead_actor());
	}

}
