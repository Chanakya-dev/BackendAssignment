package Movie.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("conroller2")
public class Controller2 {
    private Servicess serviced;
    public Controller2(Servicess serviced) {
        this.serviced = serviced;
    }
    @GetMapping("update/{id}/{add}")
    public String updated(@PathVariable Long id,@PathVariable String add){ 
        serviced.updating(id,add);
        return "changed the title";
    }

    // Prepare a Method for Updating the Data

}

