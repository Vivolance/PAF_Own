package ElsonTFIP.day21.OwnPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ElsonTFIP.day21.OwnPractice.model.TVShow;
import ElsonTFIP.day21.OwnPractice.repository.TVShowRepository;

//(Second Step)The service provides high level interface for the applications buisness logic and abstract away the details
//of the repo layer
@Service
public class TVShowService {
    //Encapsulating the repo within the service layer helps to decouple business logic from the data access layer(repo)
    //This allows ease of modifying the app behaviour w/o affecting the data access code
    @Autowired
    private TVShowRepository tvShowRepo;

    //The sevice layer has a method called findAll() which retrieves a list of TV show from the database by calling the getTvShow method of the repo.
    //This method returns a list of Tv Shows
    public List<TVShow> findAll() {
        return tvShowRepo.getTvShows(3, 0);
    }
    
}
