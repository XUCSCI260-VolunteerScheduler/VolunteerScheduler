package io.github.xucsci260volunteerscheduler.DAL.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveDatabase() {
        String sql = "SCRIPT TO 'src/main/resources/database.sql'";

        jdbcTemplate.execute(sql);
    }
}
