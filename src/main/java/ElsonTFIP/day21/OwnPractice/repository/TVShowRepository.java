package ElsonTFIP.day21.OwnPractice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class TVShowRepository {

    @Autowired
    private JdbcTemplate template;

    public SqlRowSet get(final Integer tvId) {
        String sql = "SELECT * FROM TVShows WHERE id = ?";
        return template.queryForRowSet(sql, tvId);
        
    }
    
}
