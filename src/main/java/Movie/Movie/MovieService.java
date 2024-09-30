package Movie.Movie;

/*  import java.util.List;*/

// import org.springframework.stereotype.Service;

// @Service
// public class MovieService {

//     private final MovieRepo movieRepo;
    
//     public MovieService(MovieRepo movieRepo) {
//         this.movieRepo = movieRepo;
//     }

//     public List<MovieApp> getAllMovies(){
//         return movieRepo.findAll();
//     }

//     public MovieApp saveMovies(MovieApp movie){
//         return movieRepo.save(movie);
//     }

//     public void updatedMovie(String mname, MovieApp updatedMovie ){
//         return movieRepo.updatedMovie(mname);
//     }

    
// }

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepo movieRepo;
    
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    // Get all movies
    public List<MovieApp> getAllMovies() {
        return movieRepo.findAll();
    }

    // Save a new movie
    public MovieApp saveMovies(MovieApp movie) {
        return movieRepo.save(movie);
    }

    // Update the movie without using an if condition
    public void updatedMovie(String mname, MovieApp updatedMovie) {
        // Fetch the first movie that matches the mname directly (assuming there will be at least one match
        MovieApp movie = movieRepo.findBymname(mname).get(0);
        
        // Directly set the updated fields
        movie.setMname(updatedMovie.getMname());
        movie.setGenre(updatedMovie.getGenre());
        movie.setPopular(updatedMovie.isPopular());

        // Save the updated movie to the database
        movieRepo.save(movie);
    }
}
