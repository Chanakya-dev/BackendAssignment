package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    // Prepare a Method for Updating the Data

    @Autowired
    private MovieService movieService;
    
    public Controller2(MovieService movieService) {
        this.movieService = movieService;
    }
    @PostMapping("/update")
    public void update(@PathVariable String name,@PathVariable long id) throws Exception{
        movieService.getupdate(name,id);
    }
    
    

}
