package Movie.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class movieservice {
    private final movierepo repository;

    public movieservice(movierepo repository) {
        this.repository = repository;
    }

    public List<MovieApp> savebulk(List<MovieApp> movies) {
        return repository.saveAll(movies);
    }

    public List<MovieApp> getMovies() {
        return repository.getAllMovies();
    }

    public void getupdated(String name, Long id) {
        repository.updateByNameContaining(name, id);
    }

}
