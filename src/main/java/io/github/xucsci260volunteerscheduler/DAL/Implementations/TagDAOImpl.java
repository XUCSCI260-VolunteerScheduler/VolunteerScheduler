package io.github.xucsci260volunteerscheduler.DAL.Implementations;

import io.github.xucsci260volunteerscheduler.DAL.Interfaces.TagDAO;
import io.github.xucsci260volunteerscheduler.Domain.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

        return jdbcTemplate.query(sql, (rs, rowNum) ->
        new Tag(rs.getString("T_NAME")));
    }
}
