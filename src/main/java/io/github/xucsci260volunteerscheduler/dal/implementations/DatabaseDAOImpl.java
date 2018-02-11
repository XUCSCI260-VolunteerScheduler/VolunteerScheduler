package io.github.xucsci260volunteerscheduler.dal.implementations;

import io.github.xucsci260volunteerscheduler.dal.interfaces.DatabaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseDAOImpl implements DatabaseDAO {


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean saveDatabase() {
        String sql = "SCRIPT TO 'src/main/resources/data.sql'";

        jdbcTemplate.execute(sql);

        return true;
    }
}
