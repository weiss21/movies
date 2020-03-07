package cstWeek;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String movieTitle;
	
	@NotNull
	private Integer rating;
	
	public Movie() {
		movieTitle = "The Thing";
		rating = 5;
	}
	
	public Movie(String movieTitle, Integer rating) {
		super();
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
	
	public long getId() {
		return this.id;
	}
	
}
