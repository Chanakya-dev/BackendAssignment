package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class Controller1 {
    // Prepare 2 Methods For Get and Post
  @Autowired
    private MService movieService; 

    @GetMapping("/popular")
    public List<MovieApp> getPopularMovies() {
        return movieService.getPopularMovies(); 
    } 
    @PostMapping("saveMovies")
    public MovieApp saved(@RequestBody MovieApp m){
        return movieService.addMovie(m);
    }
}

