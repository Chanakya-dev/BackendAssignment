package Movie.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface  myrepo extends JpaRepository<MovieApp,Long>{
    // @Query("Update MovieApp m set m.name=:name where m.id=:id")
    // void updateMovie(@Param("name") String name,@Param("id")Long id);
@Modifying
@Transactional
    @Query("update MovieApp m set m.mname=:mname where m.id=:id")
    void updateMovie(@Param("mname") String mname, @Param("id") Long id);

    //  @Query("Update movieapp m set m.name=:name where m.id=:id")
    // void updateMovie(@Param("name") String name, @Param("id") Long id);
    
}
