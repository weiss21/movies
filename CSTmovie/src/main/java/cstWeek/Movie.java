package cstWeek;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {

	// Private class variables
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String movieTitle;
	
	@NotNull
	private Integer rating;
	
	@NotNull
	private String time;
	
	@NotNull
	@Size(min=3, max=25)
	private String name;
	
	// Default Constructors
	public Movie() {
		name = null;
		movieTitle = null;
		rating = null;
		time = new java.util.Date().toString();
	}
	
	public Movie(String name, String movieTitle, Integer rating) {
		super();
		this.name = name;
		this.movieTitle = movieTitle;
		this.rating = rating;
	}
	
	// Set methods
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	// Get Methods
	public String getMovieTitle() {
		return this.movieTitle;
	}
	
	public Integer getRating() {
		return this.rating;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return this.id;
	}
	
}
