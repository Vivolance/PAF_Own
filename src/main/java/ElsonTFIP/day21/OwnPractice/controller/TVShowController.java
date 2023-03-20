package ElsonTFIP.day21.OwnPractice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<String> getTvShow(@PathVariable("id") Integer tvId) {
        Optional<TVShow> opt = tvShowService.findShowById(tvId);
        if (opt.isEmpty()) {
            return ResponseEntity.status(404).body(Json.createObjectBuilder().add("message", "Cannot find TV Show with id " + tvId().build()toString()));

        }

        return ResponseEntity.ok(opt.get().toJSON().toString());
    }

    
}
