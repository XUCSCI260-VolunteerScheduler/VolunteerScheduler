package io.github.xucsci260volunteerscheduler.controller;

import io.github.xucsci260volunteerscheduler.services.interfaces.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {

    private DatabaseService databaseService;

    @Autowired
    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    /**
     * calls service to save database to disk
     * @return successful
     */
    @RequestMapping("/saveDB")
    public @ResponseBody boolean saveDatabase() {
        return databaseService.saveDatabase();
    }
}
