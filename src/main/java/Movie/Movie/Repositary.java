package Movie.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface Repositary extends JpaRepository<MovieApp, Long> {
    @Query("SELECT m FROM MOVIEAPP m WHERE m.title=:name")
    MovieApp update(@Param("name") String name);

    
}
