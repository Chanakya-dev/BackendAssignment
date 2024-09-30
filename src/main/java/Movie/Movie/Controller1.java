package Movie.Movie;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Controller1")
public class Controller1 {
    // Prepare 2 Methods For Get and Post 
    private service service1;
    public Controller1 (service service1){
        this.service1=service1;
   }
   @PostMapping("savedata")
   public MovieApp save(@RequestBody MovieApp enter){
        return service1.save(enter);
   }
   @GetMapping("getdata")
   public List<MovieApp> got(){
        return service1.get();
   }
}

