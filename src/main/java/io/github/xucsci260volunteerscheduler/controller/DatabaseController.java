package io.github.xucsci260volunteerscheduler.controller;

import io.github.xucsci260volunteerscheduler.dal.interfaces.DatabaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {

    @Autowired
    private DatabaseDAO databaseDAO;

    @RequestMapping("/saveDB")
    public @ResponseBody boolean saveDatabase() {
        return databaseDAO.saveDatabase();
    }
}
