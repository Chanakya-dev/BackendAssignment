package Movie.Movie;

import org.springframework.stereotype.Service;
@Service
public class mService {
    
    private mRepo repointerfaceasavarible;

    public mService(mRepo repointerfaceasavarible) {
        this.repointerfaceasavarible = repointerfaceasavarible;
    }
    
    private MovieApp entityasavarible(MovieApp movieapprefrenceparam){
        return repointerfaceasavarible.save(movieapprefrenceparam);
    }
}
