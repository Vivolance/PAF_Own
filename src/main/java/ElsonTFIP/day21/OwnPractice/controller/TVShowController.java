package ElsonTFIP.day21.OwnPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ElsonTFIP.day21.OwnPractice.model.TVShow;
import ElsonTFIP.day21.OwnPractice.service.TVShowService;

@RestController
@RequestMapping(path="/tvshow")
public class TVShowController {

    @Autowired
    private TVShowService tvShowService;

    @GetMapping("/{id}")
    public ResponseEntity<List<TVShow>> getTvShows() {
        List<TVShow> tvShows = tvShowService.findAll();

        return new ResponseEntity<List<TVShow>>(tvShows, HttpStatus.OK);
    
    }

    
}
