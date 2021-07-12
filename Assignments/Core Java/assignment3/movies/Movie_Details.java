package movies;

public class Movie_Details {
	private String movie_name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isMovieName(String name) {
		return this.movie_name.equals(name);
	}

	public boolean isMovieGenre(String genre) {
		return this.genre.equals(genre);
	}
	public Movie_Details(){}
	public Movie_Details(String movie_name, String lead_actor, String lead_actress, String genre) {
		super();
		this.movie_name = movie_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "{ movie : " + movie_name + ", Lead Actor :" + lead_actor + ", Lead Actress :"
				+ lead_actress + ", Genre :" + genre + " }";
	}

}
