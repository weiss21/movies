package cstWeek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class Intro {	//localhost:8080/intro?title=thing
	
	@Autowired
	MovieRepository movieRepository;
	
	//Sample Mapping
	@GetMapping("/intro")
	public String intro(@RequestParam("title") String title, Model model) {
		model.addAttribute("title", title);
		model.addAttribute("time", new java.util.Date().toString());
		return "index";
	}
	//Page to enter movie form.
	@GetMapping("/movie/new")
	public String createMovie(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "movie_form";
	}
	
	// Result Page
	@PostMapping("/movie")
	public String processMovieForm(@Valid Movie movie, 
			BindingResult result, 
			Model model) {
		if(result.hasErrors()) {
			return "movie_form";
		}
		movieRepository.save(movie);
		return "movie_show";	
	}
	
	//Movie Form Page when Refreshed.
	@GetMapping("/movie")
	public String getAllMovie(Model model) {
		Iterable<Movie> movie = movieRepository.findMovieRatingsOrderByTitleDateDesc();
		model.addAttribute("movie", movie);
		return "movie_list";
	}


	
}
