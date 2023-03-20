package ElsonTFIP.day21.OwnPractice.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ElsonTFIP.day21.OwnPractice.model.TVShow;

@Repository
public class TVShowRepository {

    //JdbcTemplate acts as a connection pool between DB(mysql) and spring application
    //This connection pool is configured in the application properties folder with the DB url, username, password. 
    @Autowired
    private JdbcTemplate template;

    public List<TVShow> getTvShows(final int limit, final int offset) {

        final List<TVShow> result = new LinkedList<>();

        final SqlRowSet rs = template.queryForRowSet(
            "select * from TVShows limit ? offset ?", 3, 0);
    

        while (rs.next()) {
            TVShow tv = new TVShow();
            tv.setId(rs.getInt("id"));
            tv.setTitle(rs.getString("title"));
            tv.setGenre(rs.getString("genre"));
            tv.setRating(rs.getFloat("rating"));
            result.add(tv);

        }
        
        return (Collections.unmodifiableList(result));
    }
    
}
