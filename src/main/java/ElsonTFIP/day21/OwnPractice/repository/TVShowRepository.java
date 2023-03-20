package ElsonTFIP.day21.OwnPractice.repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import ElsonTFIP.day21.OwnPractice.model.TVShow;
//(First Step) The repository interacts with the DB using JDBC template to execute SQL queries to retrieve data from DB
@Repository
public class TVShowRepository {

    //JdbcTemplate acts as a connection pool between DB(mysql) and spring application
    //This connection pool is configured in the application properties folder with the DB url, username, password.
    @Autowired
    private JdbcTemplate template;

    //limit states the final number 
    public List<TVShow> getTvShows(final int limit, final int offset) {
        //We are using linkedlist to be populated with the values in the data row by row
        final List<TVShow> result = new LinkedList<>();
        //SqlRowSet is an interface that has the method queryForRowSet which allows querying the DB for each row as a set, it takes in SQL
        //Limit sets stopping point, offset sets the starting point. by default offset = 0
        final SqlRowSet rs = template.queryForRowSet(
            "select * from TVShows limit ? offset ?", 3, 0);
    
        //Loops through every row in the table and obtain its respective value
        while (rs.next()) {
            TVShow tv = new TVShow();
            tv.setId(rs.getInt("id"));
            tv.setTitle(rs.getString("title"));
            tv.setGenre(rs.getString("genre"));
            tv.setRating(rs.getFloat("rating"));
            result.add(tv);

        }
        //Collection implements list, unmodifiable is called upon collections to return a list object that cannot be modified,
        //This is so we prevent any kind of changes when retrieving data from the DB to the server.
        return (Collections.unmodifiableList(result));
    }
    
}
