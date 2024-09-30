package Movie.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controller1 {

    private final movieservice ms;
    private final Controller2 controller2;

    public Controller1(movieservice ms, Controller2 controller2) throws Exception {
        this.ms = ms;
        this.controller2 = controller2;// directly calling the controller2 without clicking on run.
    }

    @PostMapping("/savebulk")
    public List<MovieApp> postMethodName(@RequestBody List<MovieApp> entity) {
        return ms.savebulk(entity);
    }

    @GetMapping("/getall")
    public List<MovieApp> getMethodName() {
        return ms.getMovies();
    }

    // Prepare 2 Methods For Get and Post
}
