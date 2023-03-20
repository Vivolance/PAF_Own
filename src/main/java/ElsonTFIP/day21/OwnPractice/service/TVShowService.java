package ElsonTFIP.day21.OwnPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ElsonTFIP.day21.OwnPractice.model.TVShow;
import ElsonTFIP.day21.OwnPractice.repository.TVShowRepository;

public class TVShowService {

    @Autowired
    private TVShowRepository tvShowRepo;

    public List<TVShow> findAll() {
        return tvShowRepo.getTvShows(3, 0);
    }
    
}
