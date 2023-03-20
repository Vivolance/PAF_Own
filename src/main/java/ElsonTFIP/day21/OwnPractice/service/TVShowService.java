package ElsonTFIP.day21.OwnPractice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import ElsonTFIP.day21.OwnPractice.model.TVShow;
import ElsonTFIP.day21.OwnPractice.repository.TVShowRepository;

public class TVShowService {

    @Autowired
    private TVShowRepository tvShowRepo;

    public Optional<TVShow> findShowById(final Integer tvId) {
        SqlRowSet rs = tvShowRepo.get(tvId);
        while (rs.next()) {
            return Optional.of(TVShow.add(rs));
        }

        return Optional.empty();
        
    }
    
}
