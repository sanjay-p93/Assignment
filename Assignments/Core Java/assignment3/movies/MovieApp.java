package movies;

import java.util.ArrayList;
import java.util.List;

public class MovieApp {

	public static void main(String[] args) {

		Movie_DetailList movList= new Movie_DetailList();
		
		movList.add_movie(new Movie_Details("rambo","stalone","Yvette Monreal","action"));
		movList.add_movie(new Movie_Details("rocky","stalone","Talia Shire","action"));
		movList.add_movie(new Movie_Details("Jumanji","Robin Williams","Kirsten Dunst","action"));
		movList.add_movie(new Movie_Details("CITY LIGHTS","Charles Chaplin","Virginia Cherrill","comedy"));
		movList.add_movie(new Movie_Details("bfgcvxcv","stasdfsdflone","dfgdfgdfnreal","horror"));
		
		movList.list_allmovie();
		System.out.println("\n");
		
		Movie_Details mov = movList.find_movie_by_name("rambo");
		if(mov!=null)
			System.out.println(mov);
		System.out.println("\n");

		List<Movie_Details> genreList = movList.find_movie_by_genre("comedy");
		if(!genreList.isEmpty())
			System.out.println(genreList);
		System.out.println("\n");
		
		movList.remove_movie("rocky");
		
		movList.list_allmovie();
		System.out.println("\n");
		
		movList.movieListSort("Movie Name");		
		movList.movieListSort("Genre");
		movList.movieListSort("Lead Actor");		
		movList.movieListSort("Lead Actress");

	}

}
