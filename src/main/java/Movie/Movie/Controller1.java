package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")

public class Controller1 {
    // Prepare 2 Methods For Get and Post 
    private final MovieService movieService;

    @Autowired
    public Controller1(MovieService movieService){
        this.movieService= movieService;
    
    }

    @PostMapping("/saveMovies")
    public MovieApp addMovie(@RequestBody MovieApp movie){
        return movieService.saveMovies(movie);
    }

    @GetMapping("/getMovies")
    public List<MovieApp> getAllMovies(){
        return movieService.getAllMovies();
    }

}


