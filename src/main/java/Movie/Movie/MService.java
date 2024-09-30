package Movie.Movie;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MService {
    private final MRepo movieRepo;
    public MService(MRepo movieRepo){
        this.movieRepo = movieRepo;
    }
    public List<MovieApp> getMoviesByMname(String mname){
        return movieRepo.findByMname(mname);
    }
    public List<MovieApp> getPopularMovies(){
        return movieRepo.findByIsPopularTrue();
    }
    
    public List<MovieApp> getMoviesByGenre(String genre) {
        return movieRepo.findByGenre(genre);
    }
    public MovieApp addMovie(MovieApp movie) {
        return movieRepo.save(movie); 
    }
    public MovieApp updatedMovie(@PathVariable Long id, MovieApp updatedMovie) {
        movieRepo.updateMovie(id, updatedMovie.getMname(), updatedMovie.getGenre(), updatedMovie.isPopular());
        return movieRepo.findById(id).orElse(null); 
    }
    
}
