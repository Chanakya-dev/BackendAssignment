package Movie.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public  interface MovieRepo extends JpaRepository<MovieApp, Long>{
    
    
}
