package Movie.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class Controller2 {
    private final Service service = new Service();


@PostMapping("update")
public List<MovieApp>update(@RequestBody List<MovieApp>m){
    return service.update(m);
}
}
