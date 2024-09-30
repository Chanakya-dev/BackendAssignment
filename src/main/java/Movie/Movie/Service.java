package Movie.Movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repositary repo;

    public List<MovieApp> update(List<MovieApp>m){
        return repo.saveAll(m) ;
    }
    
}
