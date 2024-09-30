package Movie.Movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Controller2")
public class Controller2 {
    // Prepare a Method for Updating the Data
    private service service1;
    public Controller2(service service1){
        this.service1=service1;
    }
    @GetMapping("update/{id}/{add}")
    public String updated(@PathVariable Long id, @PathVariable String add){
    service1.updating(id,add);
    return "change the title";
    }
}
