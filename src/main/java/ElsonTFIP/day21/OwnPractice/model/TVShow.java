package ElsonTFIP.day21.OwnPractice.model;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class TVShow {
    private Integer id;
    private String name;
    private String network;
    private Integer rating;

    public TVShow() {
        // Default constructor
    }

    public TVShow(Integer id, String name, String network, Integer rating) {
        this.id = id;
        this.name = name;
        this.network = network;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

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

