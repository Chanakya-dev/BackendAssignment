package Movie.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/movie")
public class Controller1 {
    // Prepare 2 Methods For Get and Post 
    public movieServices m;

    public Controller1(movieServices m) {
        this.m = m;
    }
    @PostMapping("/save/{mname}")
    public MovieApp save( @PathVariable MovieApp f) {
        return m.save(f);
    }
    @GetMapping("/get")
    public List<MovieApp>  saveAllMovieApp( @RequestBody List<MovieApp> f) {
    return m.saveAll(f);
}
}