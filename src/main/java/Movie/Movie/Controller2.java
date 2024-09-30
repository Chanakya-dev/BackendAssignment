package Movie.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Controller2 {
    // Prepare a Method for Updating the Data
    private final movieservice ms;

    public Controller2(movieservice ms) {
        this.ms = ms;
    }

    @PutMapping("/update/{id}/{name}")
    public void updating(@PathVariable String name, @PathVariable Long id) throws Exception {
        ms.getupdated(name, id);
    }

}
