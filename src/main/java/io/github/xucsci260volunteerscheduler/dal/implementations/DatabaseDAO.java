package io.github.xucsci260volunteerscheduler.dal.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveDatabase() {
        String sql = "SCRIPT TO 'src/main/resources/schema.sql";

        jdbcTemplate.execute(sql);
    }
}
