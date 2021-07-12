package movies;

import java.util.*;


public class Movie_DetailList {
	private List<Movie_Details> movieList = new ArrayList<>();
	


	public void add_movie(Movie_Details mv) {
		this.movieList.add(mv);
	}

	public void remove_allmovie() {
		this.movieList.clear();
	}

	public void list_allmovie() {
		System.out.println(movieList);
	}
	
	public void remove_movie(String name) {
		Movie_Details mov = find_movie_by_name(name);
		if(mov!=null)
			this.movieList.remove(mov);
	}
	
	public Movie_Details find_movie_by_name(String name) {
		for(Movie_Details movie : movieList){
			if(movie.isMovieName(name)) {
				return movie;
			}
		}
		return null;
	}

	public List<Movie_Details> find_movie_by_genre(String genre) {
		List<Movie_Details> genreList = new ArrayList<>();

		for(Movie_Details movie : movieList){
			if(movie.isMovieGenre(genre)) {
				genreList.add(movie);
			}
		}
		return genreList;
	}
}
