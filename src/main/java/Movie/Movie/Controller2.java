package Movie.Movie;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller2 {

    private final mService movieService;

    public Controller2(mService movieService) {
        this.movieService = movieService;
    }

    @PutMapping("/movies/{id}")
    public MovieApp updateMovie(@PathVariable Long id, @RequestBody MovieApp updatedMovie) {
        return movieService.updateMovie(id, updatedMovie);
    }
}
