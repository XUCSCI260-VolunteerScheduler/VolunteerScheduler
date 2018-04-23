package io.github.xucsci260volunteerscheduler.services.implementation;

import io.github.xucsci260volunteerscheduler.dal.interfaces.DatabaseDAO;
import io.github.xucsci260volunteerscheduler.dal.interfaces.TagDAO;
import io.github.xucsci260volunteerscheduler.domain.Tag;
import io.github.xucsci260volunteerscheduler.services.interfaces.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDAO tagDAO;
    @Autowired
    private DatabaseDAO databaseDAO;

    /**
     * Constructor for passing a mocked DAO
     * *** FOR TESTING ONLY ***
     * @param tagDAO
     */
    public TagServiceImpl(TagDAO tagDAO, DatabaseDAO databaseDAO) {
        this.tagDAO = tagDAO;
        this.databaseDAO = databaseDAO;
    }

    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }

    @Override
    public Tag addTag(String text) {
        Tag t;

        if (tagDAO.addTag(text)) {
            t = new Tag(text);

            databaseDAO.saveDatabase();
        } else {
            t = null;
        }

        return t;
    }

    @Override
    public Tag removeTag(String text) {
        Tag t;
        if (tagDAO.removeTag(text)) {
            t = new Tag(text);

            databaseDAO.saveDatabase();
        } else {
            t = null;
        }

        return t;
    }
}
