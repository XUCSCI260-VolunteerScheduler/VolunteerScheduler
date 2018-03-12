package io.github.xucsci260volunteerscheduler.services.implementation;

import io.github.xucsci260volunteerscheduler.dal.interfaces.DatabaseDAO;
import io.github.xucsci260volunteerscheduler.services.interfaces.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The file DatabaseServiceImpl.java was created by Chris on 9:03 PM at 3/11/2018
 */

@Component
public class DatabaseServiceImpl implements DatabaseService {

    private DatabaseDAO databaseDAO;

    @Autowired
    public DatabaseServiceImpl(DatabaseDAO databaseDAO) {
        this.databaseDAO = databaseDAO;
    }

    /**
     * calls DAO to save database
     *
     * @return successful
     */
    @Override
    public boolean saveDatabase() {
        return databaseDAO.saveDatabase();
    }
}
