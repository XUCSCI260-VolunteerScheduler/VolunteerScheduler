package io.github.xucsci260volunteerscheduler.dal.implementations;

import io.github.xucsci260volunteerscheduler.dal.interfaces.TagDAO;
import io.github.xucsci260volunteerscheduler.domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TagDAOImpl implements TagDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public TagDAOImpl(JdbcTemplate jdbc) {
        this.jdbcTemplate = jdbc;
    }

    /**
     * queries database for all tags
     * @return all tags in database
     */
    @Override
    public List<Tag> getAllTags() {
        String sql = "SELECT * FROM TAG";

        return jdbcTemplate.query(sql,
                (rs, rowNum) ->
                    new Tag(rs.getString("T_NAME")));
    }

    /**
     * inserts new tag into the database
     * @param text of tag to create
     * @return tag that was inserted
     */
    @Override
    public boolean addTag(String text) {
        String sql = "INSERT INTO TAG (T_NAME) VALUES (?)";

        jdbcTemplate.update(sql, new Object[] {text});

        return true;
    }

    /**
     * removes tag from database
     * @param text of tag to remove
     * @return tag that was removed
     */
    @Override
    public boolean removeTag(String text) {

        String sql = "DELETE FROM TAG WHERE T_NAME = ?";

        jdbcTemplate.update(sql, new Object[] {text});

        return true;
    }
}
