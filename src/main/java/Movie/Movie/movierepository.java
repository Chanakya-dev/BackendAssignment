package Movie.Movie;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

public interface movierepository  extends JpaRepository<MovieApp, Long> {

   @Query("UPDATE MovieApp m SET m.mname = :mname WHERE m.mname = :mname")
  @Modifying
  void mnameUpdate(@Param("mname") String mname );
}






    
    

  
  
  
  

