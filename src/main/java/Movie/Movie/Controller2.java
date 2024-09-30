// package Movie.Movie;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api/movies")

// public class Controller2 {
//     // Prepare a Method for Updating the Data
    
//     private final MovieService movieService;

    
//     public Controller2(MovieService movieService){
//         this.movieService= movieService;
    
//     }

//     @PutMapping("update/{mname}")
//     public MovieApp updatedMovie(@PathVariable String mname, @RequestBody MovieApp updatedMovie){
//         return movieService.updatedMovie(mname, updatedMovie);
//     }

// }

package Movie.Movie;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class Controller2 {

    private final MovieService movieService;

    @Autowired
    public Controller2(MovieService movieService) {
        this.movieService = movieService;
    }

    // GET method to retrieve all movies
    @GetMapping
    public List<MovieApp> getAllMovies() {
        return movieService.getAllMovies();
    }

    // POST method to add a new movie
    @PostMapping("/add")
    public MovieApp addMovie(@RequestBody MovieApp movie) {
        return movieService.saveMovies(movie);
    }

    // PUT method to update a movie by its name (mname)
    @PutMapping("/update/{mname}")
    public void updateMovie(@PathVariable String mname, @RequestBody MovieApp updatedMovie) {
        movieService.updatedMovie(mname, updatedMovie);
    }
}

