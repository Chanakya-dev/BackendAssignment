package Movie.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/updatedmovies")
public class Controller2 {
    // Prepare a Method for Updating the Data
    @Autowired
    private MService movieService;
    @PutMapping("/{id}") 
    public ResponseEntity<MovieApp> updatedMovie(@PathVariable Long id, @RequestBody MovieApp updatedMovie) {
        MovieApp movie = movieService.updatedMovie(id, updatedMovie);
        return ResponseEntity.ok(movie);
    }

}
