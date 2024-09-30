package Movie.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Controller1 {
    // Prepare 2 Methods For Get and Post 
    @GetMapping("/met1")
    public String name(){
        return "hey how are you";

    }

    @PostMapping("/met2")
    public int id(){
        return id();
    }


}
