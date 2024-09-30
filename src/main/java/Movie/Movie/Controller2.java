package Movie.Movie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rewrite")
public class Controller2 {
    // Prepare a Method for Updating the Data
    public movieServices m;

    public Controller2(movieServices m) {
        this.m = m;
    }

    @PostMapping("/update")
    public String updateMovieTitle( @RequestBody MovieApp f) {
        return m.mnameUpdate(f);
    }
}
