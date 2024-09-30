package Movie.Movie;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class service {
    
    private movierepo connect;
    public service (movierepo connect){
        this.connect=connect;
    }
public MovieApp save(MovieApp enter){
    return (MovieApp) connect.save(enter);
}
public List<MovieApp> get(){
    return connect.findAll();
}

public void updating(Long id,String edit){
    connect.updated(edit,id);
}


}
