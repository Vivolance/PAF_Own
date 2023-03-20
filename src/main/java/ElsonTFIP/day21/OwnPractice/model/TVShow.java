package ElsonTFIP.day21.OwnPractice.model;

//import org.springframework.jdbc.support.rowset.SqlRowSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Using lombok allows us to not need to set any getter/setter/constructors. Under hood these are created for us.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TVShow {
    private Integer id;
    private String title;
    private String genre;
    private Float rating;

}

