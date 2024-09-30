package Movie.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Controller1 {
      // Prepare 2 Methods For Get and Post 
    private final MovieService movieService;
    private final Controller2 controller2;
    public Controller1(MovieService movieService, Controller2 controller2) {
        this.movieService = movieService;
        this.controller2 = controller2;
    }
     @PostMapping("/saveall")
     public List<MovieApp> save(@RequestBody List<MovieApp>entity){
        return movieService.saved(entity);
     }
     @GetMapping("/getAll")
     public List<MovieApp>getall(){
        return movieService.getMovieApps();
     }
    
}
