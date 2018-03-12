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

    private TagDAO tagDAO;
    private DatabaseDAO databaseDAO;

    /**
     * Autowired constructor
     * @param tagDAO tag Data Access Object
     * @param databaseDAO database Data Access Object
     */
    @Autowired
    public TagServiceImpl(TagDAO tagDAO, DatabaseDAO databaseDAO) {
        this.tagDAO = tagDAO;
        this.databaseDAO = databaseDAO;
    }

    /**
     * calls DAL to return all tags in database
     * @return all tags in database
     */
    @Override
    public List<Tag> getAllTags() {
        return tagDAO.getAllTags();
    }

    /**
     * calls DAL to add new tag to the database
     * @param text of new tag
     * @return new tag
     */
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

    /**
     * calls DAL to remove tag from the database
     * @param text of tag to remove
     * @return removed tag
     */
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
