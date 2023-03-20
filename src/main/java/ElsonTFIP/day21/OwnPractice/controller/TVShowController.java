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

//(Third Step) Maps all request to the /tvshow endpoint to this controller
@RestController
@RequestMapping(path="/tvshow")
public class TVShowController {
    //Allows the controller to use the method provided in the service layer to interact with the DB
    @Autowired
    private TVShowService tvShowService;

    //Get mapping because we are not changing the state of the database, we are simply retrieving list of Tv show from the DB
    //The ReponseEntity class represents the entire HTTP response including the status code, headers, body
    //It is use to wrap the list of tv shows returned by the service as the body of the http reponse with an OK code.
    @GetMapping("/")
    public ResponseEntity<List<TVShow>> getTvShows() {
        List<TVShow> tvShows = tvShowService.findAll();

        return new ResponseEntity<List<TVShow>>(tvShows, HttpStatus.OK);
    
    }

    
}
