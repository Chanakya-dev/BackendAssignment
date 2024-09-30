package Movie.Movie;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class Servicess {
    private myrepo connect;
    public Servicess (myrepo connect){
        this.connect=connect;
    }
public MovieApp save(MovieApp enter){
    return connect.save(enter);
}
public List<MovieApp> get(){
    return connect.findAll();
}

public void updating(Long id,String edit){
    connect.updateMovie(edit,id);
}

}
