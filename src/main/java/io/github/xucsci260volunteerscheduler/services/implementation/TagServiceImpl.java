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
    public TagServiceImpl(TagDAO tagDAO) {
        this.tagDAO = tagDAO;
    }

    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }

    @Override
    public Tag addTag(String text) {

        Tag t = tagDAO.addTag(text);

        databaseDAO.saveDatabase();

        return t;
    }
}
