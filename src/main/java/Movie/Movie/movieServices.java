package Movie.Movie;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class movieServices {
    public movierepository n;

    public movieServices(movierepository n) {
        this.n = n;
    }
    public MovieApp save(MovieApp f) {
        return n.save(f);
}
   public List<MovieApp> saveAll(List<MovieApp> f) {
    return n.saveAll(f);
   }
   public String mnameUpdate(MovieApp f) {
     n.mnameUpdate(f.getMname());
     return f.getMname();
   }
}