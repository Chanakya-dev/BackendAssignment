package Movie.Movie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Controller2 {
    // Prepare a Method for Updating the Data

    @PutMapping("/movies/{id}")
    public MovieApp updateMovie(@PathVariable Long id, @RequestBody MovieApp updatedMovie, Controller2 movieService) {
        return movieService.updateMovie(id, updatedMovie, movieService);
    }
}
