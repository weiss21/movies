package cstWeek;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

//Interface for Movie Class. Has One method to return ratings by recent date.
public interface MovieRepository extends CrudRepository<Movie, Long> {

	@Query("select m from Movie m order by id desc, movieTitle")
	List<Movie> findMovieRatingsOrderByTitleDateDesc(); 
	
}
