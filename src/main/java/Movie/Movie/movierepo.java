package Movie.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface movierepo extends JpaRepository<MovieApp, Long>{

    @Query("SELECT m from Movies WHERE title:= name")
    MovieApp findByName(@Param("name") String name);

    void updated(String edit, Long id);

    

    
}
