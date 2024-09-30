package Movie.Movie;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface movierepo extends JpaRepository<MovieApp, Long> {
    @Query("from MovieApp")
    List<MovieApp> getAllMovies();

    @Modifying
    @Transactional
    @Query("update MovieApp m set m.mname = :name where m.id=:id")
    void updateByNameContaining(@Param("name") String name, @Param("id") Long id);

}
