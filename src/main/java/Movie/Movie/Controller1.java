package Movie.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller1 {
    // Prepare 2 Methods For Get and Post 

    @GetMapping("/getdata")
    public String getdata(){
        return "Hello World";
    }

    @PostMapping("/postdata/{name}")
    public String postdata(@PathVariable String name){
        return "Hello "+name;
    }
}
