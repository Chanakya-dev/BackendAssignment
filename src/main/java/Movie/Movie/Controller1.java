package Movie.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller1 {

    private final mService movieService;

    public Controller1(mService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieApp> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movies")
    public MovieApp addMovie(@RequestBody MovieApp newMovie) {
        return movieService.saveMovie(newMovie);
    }
}
