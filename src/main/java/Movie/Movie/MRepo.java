package Movie.Movie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  MRepo extends JpaRepository<MovieApp, Long> {
    List<MovieApp>findByMname(String mname);
    List<MovieApp> findByGenre(String genre);
    List<MovieApp> findByIsPopularTrue();
    @Query("UPDATE MovieApp m SET m.mname = :mname, m.genre = :genre, m.isPopular = :isPopular WHERE m.id = :id")
    void updateMovie(Long id, String mname, String genre, Boolean isPopular);
}

