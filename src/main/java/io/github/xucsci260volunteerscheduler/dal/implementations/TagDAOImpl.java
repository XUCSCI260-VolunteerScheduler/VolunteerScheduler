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

    @Override
    public List<Tag> getAllTags() {
        String sql = "SELECT * FROM TAG";

        return jdbcTemplate.query(sql,
                (rs, rowNum) ->
                    new Tag(rs.getString("T_NAME")));
    }

    @Override
    public boolean addTag(String text) {
        boolean good = false;

        String sql = "INSERT INTO TAG (T_NAME) VALUES (?)";

        jdbcTemplate.update(sql, new Object[] {text});

        good = true;

        return good;
    }

    @Override
    public boolean removeTag(String text) {
        boolean good = false;

        String sql = "DELETE FROM TAG WHERE T_NAME = ?";

        jdbcTemplate.update(sql, new Object[] {text});

        good = true;

        return good;
    }
}
