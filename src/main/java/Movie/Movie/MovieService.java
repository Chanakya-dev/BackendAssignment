package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

   private final MovieRepository MovieRepository ;
   

    public MovieService(MovieRepository movieRepository) {
    this.MovieRepository = movieRepository;
}
   public List<MovieApp> saved(List<MovieApp>movieService){
    return MovieRepository.saveAll(movieService);
   }
   public List<MovieApp> getMovieApps(){
    return MovieRepository.gerAllMovies();
   }
   public void getupdate(String name,long id){
    MovieRepository.updateByNameContaining(name, id);
   }
    
}
