package Movie.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller1")
public class Controller1 {

    private Servicess serviced;

    public Controller1(Servicess serviced) {
        this.serviced = serviced;
    }

    @PostMapping("savedata")
    public MovieApp save(@RequestBody MovieApp enter) {
        return serviced.save(enter);
    }

    @GetMapping("getdata")
    public List<MovieApp> got() {
        return serviced.get();
    }
    // Prepare 2 Methods For Get and Post 
}
