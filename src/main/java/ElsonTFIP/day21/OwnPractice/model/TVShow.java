package ElsonTFIP.day21.OwnPractice.model;

//import org.springframework.jdbc.support.rowset.SqlRowSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TVShow {
    private Integer id;
    private String title;
    private String genre;
    private Float rating;


    // public static TVShow populate(SqlRowSet rs) {
    //     TVShow tvShow = new TVShow();
    //     tvShow.setId(rs.getInt("id"));
    //     tvShow.setName(rs.getString("name"));
    //     tvShow.setNetwork(rs.getString("network"));
    //     tvShow.setRating(rs.getInt("rating"));
    //     return tvShow;
    // }

    // public JsonObject toJSON() {
    //     JsonObjectBuilder builder = Json.createObjectBuilder();
    //     builder.add("id", this.id);
    //     builder.add("name", this.name);
    //     builder.add("network", this.network);
    //     builder.add("rating", this.rating);
    //     return builder.build();
    // }
}

